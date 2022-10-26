package com.imooc.web;
//数组复制和赋值问题
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2;

        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");

        }
        array2 = array1;//指向同一个数组，是赋值
        System.out.println();
        System.out.println("array2: "+array2);
        System.out.println("array1: "+array1);
        array2 = new int[array1.length];
        for(int i=0;i<array2.length;i++){
            array2[i] = array1[i];//区别于array2 = array1，是复制（复制数组元素）
            if(i%2 == 0){
                array2[i] = i;
            }
            System.out.print(array2[i]+" ");

        }
        System.out.println();
        System.out.println("array2: "+array2);
    }
}
