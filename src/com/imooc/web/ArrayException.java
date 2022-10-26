package com.imooc.web;

import java.util.Arrays;

/**
 *  数组中的常见异常：
 *  1.数组角标越界异常：ArrayIndexOutOfBoundsException
 *
 *  2.空指针异常：NullPointerException
 *
 *
 */
public class ArrayException {
    public static void main(String[] args) {
        //1.数组角标越界异常：ArrayIndexOutOfBoundsException
        //int[] arr = new int[]{1,2,3,4,5,6,7};
/*        for(int i = 0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        //System.out.println(arr[-2]);

        //2.空指针异常：NullPointerException
        //情况一：
/*        int[] arr1 = new int[]{1,2,3,4};
        arr1 = null;
        System.out.println(arr1[0]);*/
        //情况二：
/*        int[][] arr2 = new int[4][];
        System.out.println(arr2[0][0]);*/
        //情况三：
/*        String[] arr3 = new String[]{"AA","BB","CC"};
        arr3[0]= null;
        System.out.println(arr3[0].toString());*/

/*      int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
/*        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));*/


    }
}
