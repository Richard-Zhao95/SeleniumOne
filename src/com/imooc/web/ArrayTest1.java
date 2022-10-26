package com.imooc.web;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*(99-10+1))+10;

        }
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
            sum +=arr[i];
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        avg = sum / arr.length;
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("總和值："+sum);
        System.out.println("平均值："+avg);
    }
}
