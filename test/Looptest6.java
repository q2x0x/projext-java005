package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Looptest6 {
    public static void main(String[] args) {

        //需求:程序自动生成一个1~100的手机数字,使用程序猜出这个数字是多少

        //注意点:
        //1.生成随机数的代码int number = r.nextInt(100) + 1;
        //不能写在循环的里面的,否则每一次都会产生新的随机数

        //分析
        //1.生成一个1~100的数字

        Random r = new Random();
        int number = r.nextInt(100) + 1;


        //2.猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个要猜的数字:");
            int guessnumber = sc.nextInt();

            //3.判断两个数字给出不同的提示
            //猜的数字大了,要提示,大了
            //猜的数字小了,要提示,小了
            //猜的数字中了,要提示,中了
            if(guessnumber > number){
                System.out.println("大啦哇!");
            }else if(guessnumber < number){
                System.out.println("小啦哇!");
            }else{
                System.out.println("猜中啦哇!!!");
                break;
            }
        }


    }
}
