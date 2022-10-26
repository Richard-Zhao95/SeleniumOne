package com.imooc.web;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int stu_num = scanner.nextInt();
        System.out.println("请输入"+stu_num+"名学生成绩");

        int[] stu_scores = new int[stu_num];
        for(int i = 0;i<stu_scores.length;i++){
            stu_scores[i] = scanner.nextInt();
        }

/*        for(int i = 0;i<stu_scores.length;i++){
            System.out.println(stu_scores[i]);
        }*/
        int max_Score = 0;
        for(int i = 0;i<stu_scores.length;i++){
            if(max_Score < stu_scores[i]){
                max_Score = stu_scores[i];
            }
        }
        System.out.println(max_Score);

        char level = ' ';
        for(int i = 0;i<stu_scores.length;i++){
            if(max_Score - stu_scores[i] <=10){
                level = 'A';
            }else if(max_Score - stu_scores[i] <=20){
                level = 'B';
            }else if(max_Score - stu_scores[i] <=30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("stu "+i+" score is "+stu_scores[i]+",level is "+level);
        }

    }
}
