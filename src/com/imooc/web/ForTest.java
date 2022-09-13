package com.imooc.web;
/*
键盘输入两个正整数m和n，求出它俩的最大公约数和最小公倍数
比如：12和20的最大公约数是4，最小公倍数是60
考察break关键字的使用
* */

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个正整数m:");
        int m = scanner.nextInt();

        System.out.print("请输入第一个正整数n:");
        int n = scanner.nextInt();
        int min = (m <= n)? m : n;
        int max = (m >= n)? m : n;
        for(int i = min;i>=1;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
        }

        for(int i = max;i <= m*n;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("最小公倍数为：" + i);
                break;
            }
        }


        int sum_odd = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                sum_odd += i;
            }
        }
        System.out.println("1~100之间所有奇数的和为：" + sum_odd);

        int sum_even = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                sum_even += i;
            }
        }
        System.out.println("1~100之间所有偶数的和为：" + sum_even);

        int count = 0;
        int sum_7m = 0;
        for(int i = 0;i <= 100;i++){
            if(i % 7 == 0){
                count++;
                sum_7m+=i;
            }
        }
        System.out.println("1~100之间所有7的倍数的和为：" + sum_7m);

        int sum_sxh = 0;
        for(int i = 100;i < 1000;i++){
            int a = i/100;
            int b = (i-a*100)/10;
            int c = i-a*100-b*10;
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.print("水仙花数：" + i);
            }
        }

        //九九乘法表
        System.out.println();
        for(int x = 1; x <= 9;x++){
            for(int y = 1;y <= x;y++){
                System.out.print(x+" * " + y + " = " + x * y + "  ");
            }
            System.out.println();
        }

        //100以内的质数：只能被1和它本身整除的自然数。--从2开始，到这个数减1结束，都不能被这个数本身整除
        System.out.println();
        boolean isFlag = true;
        int count_zhishu = 0;
        long startTime = System.currentTimeMillis();
        for(int i = 2;i <= 100000;i++){
            //for(int j = 2;j <= i-1;j++){
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;//只对本身是非质数的自然数有效
                }
            }
            if(isFlag == true){
                //System.out.print(i + " // ");
                count_zhishu++;
            }
            isFlag = true;
        }
        long endTime = System.currentTimeMillis();
        //System.out.println();
        System.out.println("质数个数为：" + count_zhishu);
        System.out.println("所花费的时间为：" + (endTime - startTime));

    }
}
