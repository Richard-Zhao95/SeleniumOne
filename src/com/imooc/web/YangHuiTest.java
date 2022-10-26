package com.imooc.web;

public class YangHuiTest {
    public static void main(String[] args) {
        int[][] YangHui = new int[10][];

        for(int i=0;i<YangHui.length;i++){
            YangHui[i] = new int[i+1];
            YangHui[i][0] = YangHui[i][i] = 1;
            if(i > 1){
                for(int j =1;j<YangHui[i].length-1;j++){
                    YangHui[i][j] = YangHui[i-1][j-1] + YangHui[i-1][j];

                }
            }
        }

        for(int i =0;i<YangHui.length;i++){
            for(int j=0;j<YangHui[i].length;j++){
                System.out.print(YangHui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
