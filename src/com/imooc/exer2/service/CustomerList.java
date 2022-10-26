package com.imooc.exer2.service;

import com.imooc.exer2.bean.Customer;

public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量

    /**
     * 用来初始化customers数组的构造器
     * @param totalCustomer:指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];

    }

    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
//      customers[total] = customer;
//      total++;
        //以上两行可以合并为
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param customer
     * @return true:修改成功 false：修改失败
     */

    public boolean replaceCustomer(Customer customer,int index){
        if(index < 0 || index >=total){
            return false;
        }
        customers[index] = customer;
        return true;
    }

    /**
     * 删除指定索引位置上的客户信息
     * @param index
     * @return true:删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index <0 || index >=total){
            return false;
        }
        for(int i=index;i<total-1;i++){
            customers[i] = customers[i+1];
        }
//      customers[total-1] = null;
//      total--;
        //以上两行可以合并为
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有的客户信息
     * @return 返回一个新的数组，把原先的数组中的元素放入新的数组
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i=0;i<custs.length;i++){//custs.length==total
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index <0 || index >=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
