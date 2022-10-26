package com.imooc.exer;

/**
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积
 */
//测试类
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 8;
        System.out.println(c1.CalArea());
    }
}

class Circle{
    double radius ;

    public double CalArea(){
        return radius*radius*Math.PI;
    }

}
