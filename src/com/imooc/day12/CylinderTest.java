package com.imooc.day12;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        double volume = cylinder.findVolume();
        System.out.println(volume);

        double area = cylinder.findArea();
        System.out.println(area);

    }
}
