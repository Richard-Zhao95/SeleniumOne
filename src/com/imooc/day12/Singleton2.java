package com.imooc.day12;

public class Singleton2 {
    public static void main(String[] args) {
        Bank1 bank11 = Bank1.getBankInstance1();
        Bank1 bank12 = Bank1.getBankInstance1();
        System.out.println(bank11 == bank12);

    }
}

//懒汉式：啥时候用啥时候造
class Bank1{
    //属性

    //1.私有化类的构造器
    private Bank1(){

    }

    //2.声明当前类的对象，先不初始化
    //4.此对象也必须声明为static
    private static Bank1 bankInstance1 = null;

    //3.声明public、static的返回当前类对象方法
    public static Bank1 getBankInstance1(){
        if(bankInstance1 == null) bankInstance1 = new Bank1();
        return bankInstance1;
    }
}