package com.imooc.day12;

public class Singleton1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getBankInstance();
        Bank bank2 = Bank.getBankInstance();
        System.out.println(bank1 == bank2);
    }
}
//饿汉式
class Bank{
    //...属性

    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态
    private static Bank bankInstance = new Bank();

    //3.提供公共的静态方法，返回类的对象
    public static Bank getBankInstance(){
        return bankInstance;
    }
}