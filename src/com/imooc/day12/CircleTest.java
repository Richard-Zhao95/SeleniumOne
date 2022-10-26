package com.imooc.day12;

public class CircleTest {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1();
        Circle1 c3 = new Circle1(3);
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());
        System.out.println("c3的id:"+c3.getId());
        System.out.println("创建的圆的个数："+Circle1.getTotal());
    }
}

class Circle1{
    private double radius;
    private int id;

    private static int total;
    private static int init_num = 1001;

    public Circle1() {
        id = init_num++;
        total++;
    }

    public Circle1(int radius) {
        this();
        this.radius = radius;
/*        id = init_num++;
        total++;*/
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

/*    public static void setTotal(int total) {
        Circle1.total = total;
    }*/
}