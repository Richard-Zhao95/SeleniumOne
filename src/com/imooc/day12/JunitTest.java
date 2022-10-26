package com.imooc.day12;

import org.junit.jupiter.api.Test;

import java.util.Date;


public class JunitTest {

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        Object obj = new String("AA");
        Date date = (Date)obj;
    }

    @Test
    public void testWrapper(){
        Integer in1 = new Integer(12);
        System.out.println(in1.toString());

        int i = 10;
        Integer in2 = new Integer(i);
        Integer in3 = new Integer("123");
        System.out.println(in2.toString());
        System.out.println(in3.toString());

        int i1 = in2.intValue();
        System.out.println(i1);
    }
}
