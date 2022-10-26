package com.imooc.exer2.ui;


import com.imooc.exer2.bean.Customer;
import com.imooc.exer2.service.CustomerList;
import com.imooc.exer2.util.CMUtility;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer customer = new Customer("王涛",'男',23,"18796220262","1425946168@qq.com");
        customerList.addCustomer(customer);
    }

    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu(){
        boolean loopFlag = true;
        while(loopFlag){
            System.out
                    .println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出（Y/N）:");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        loopFlag = false;
                    }

            }

        }
    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer(){
        System.out.println("添加客户的操作");
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        Customer cust = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(cust);
        if(isSuccess){
            System.out
                    .println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer(){
        System.out.println("修改客户的操作");
        System.out.println("---------------------修改客户---------------------");

        Customer cust;
        int number;
        for(;;){
            System.out.println("请选择待修改客户编号（-1退出）：");
            number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            cust = customerList.getCustomer(number-1);
            if(cust==null){
                System.out.println("无法找到指定客户！");
            }else{//找到了相应编号的客户
                break;
            }
        }
        //修改
        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("年龄(" + cust.getAge() + ")：");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readString(15, cust.getEmail());

        Customer newCustomer = new Customer(name, gender, age, phone, email);
        boolean isReplaced = customerList.replaceCustomer(newCustomer,number-1);
        if(isReplaced){
            System.out
                    .println("---------------------修改完成---------------------");
        }else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }
    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer(){
        System.out.println("删除客户的操作");
        System.out.println("---------------------删除客户---------------------");
        int index = 0;
        Customer cust;
        for(;;){
            System.out.println("请选择待删除客户编号（-1退出）：");
            index = CMUtility.readInt();
            if(index == -1){
                return ;
            }
            cust = customerList.getCustomer(index-1);
            if(cust == null){
                System.out.println("无法找到指定客户！");
            }else
                break;
        }
        //找到了指定客户
        System.out.println("确认是否删除（Y/N）:");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(index-1);
            if(deleteSuccess){
                System.out
                        .println("---------------------删除完成---------------------");
            }else{
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }
        }else{
            return;
        }

    }

    /**
     * 查询所有客户的操作
     */
    private void listAllCustomers(){
        Customer[] custs = customerList.getAllCustomers();

        System.out.println("查询所有客户的操作");

        System.out.println("---------------------------客户列表---------------------------");

        if(customerList.getTotal()==0){
            System.out.println("没有客户记录！");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for(int i=0;i<custs.length;i++){
                Customer cust = custs[i];
                System.out.println(
                        (i+1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t\t"
                        + cust.getPhone() +"\t\t" + cust.getEmail()
                );
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
