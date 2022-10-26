package com.imooc.day12.exer;
/*
 * 定义SalariedEmployee类继承Employee类，
 * 实现按月计算工资的员工处理。该类包括：private成员变量monthlySalary；
实现父类的抽象方法earnings(),该方法返回monthlySalary值；
toString()方法输出员工类型信息及员工的name，number,birthday。
 */
public class SalariedEmployee extends Employee{
    private double monthlySaraly;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySaraly) {
        super(name, number, birthday);
        this.monthlySaraly = monthlySaraly;
    }

    public double getMonthlySaraly() {
        return monthlySaraly;
    }

    public void setMonthlySaraly(double monthlySaraly) {
        this.monthlySaraly = monthlySaraly;
    }

    @Override
    public double earnings() {
        return this.monthlySaraly;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySaraly=" + monthlySaraly +
                " "+
                super.toString()+
                '}';
    }
}
