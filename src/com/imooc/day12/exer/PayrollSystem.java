package com.imooc.day12.exer;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。

 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：
/*      Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当月月份：");
        int month = scanner.nextInt();*/

        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("张三",1001,new MyDate(1995,10,18),10000);
        employees[1] = new HourlyEmployee("李四",1002,new MyDate(1995,8,19),60,240);

        //System.out.println(employees[0].toString());
        for(int i = 0;i<employees.length;i++){
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为："+ salary);

            if((++month) == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐！奖励100元");
            }

        }

    }
}
