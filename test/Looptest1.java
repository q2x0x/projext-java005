package com.itheima.test;

public class Looptest1 {
    public static void main(String[] args) {

        //逢七过游戏(打印1~100)

        //分析:
        //个位 十位 倍数(打印过)

        //1.得到1~100之间的每一个数字
        //开始:1
        //结束:100
        //由于开始和结束都知道了,所以有for
        for (int i = 1; i <= 100; i++) {
        //2.判断一个数字,如果符合就打印过,反之则打印真实的数字
        if(i % 10 == 7 || i / 10 % 10 == 7 || 1 % 7 == 0){
            System.out.println("过");
            continue;
        }
            System.out.println(i);
        }
    }
}
