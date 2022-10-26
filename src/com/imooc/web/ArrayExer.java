package com.imooc.web;

public class ArrayExer {
    public static void main(String[] args) {
        String[] arr = new String[]{"FF","EE","DD","CC","BB","AA"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //数组的反转
        //方法一：正常手法，需要注意的是循环条件要除以2，否则数组又回到了原样
/*        for(int i = 0;i<arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }*/

        //方法二：双指针
/*        for(int i=0,j=arr.length-1;i<j;i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/

        //方法三：定义一个新的数组，遍历进行挨个元素的赋值，就是最上面数组的复制

        //遍历
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //查找（或者叫搜索）
        //线性查找：
        String target = "BB";
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(target.equals(arr[i])){
                System.out.println("下标索引为："+i);
                flag=true;
            }

        }
        if(flag == false){
            System.out.println("没找到");
        }

        //二分法查找：快
        //前提：所要查找的数组是有序的
        int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int target_num = 105;
        int head = 0;//初始首索引
        int tail = arr2.length-1;//初始尾索引
        boolean flag1 = false;
        while(head <= tail){
            int middle = (head + tail)/2;
            if(target_num == arr2[middle]){
                System.out.println("下标索引为："+middle);
                flag1=true;
                break;
            }else if(target_num>arr2[middle]){
                head = middle+1;
            }else{
                tail = middle-1;
            }
        }
        if(flag == false){
            System.out.println("没找到");
        }



    }
}
