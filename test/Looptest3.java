package com.itheima.test;

import java.util.Scanner;

public class Looptest3 {
    public static void main(String[] args) {

        //需求:键盘录入一个数,判断是否为质数;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int number = sc.nextInt();

        //2.判断
        //写一个循环,从2开始判断,一直按断到number-1为止
        //看这个范围之内,有没有数字可以被number整除
        for (int i = 2; i < number; i++) {
            //i依次表示这个范围的每一个数字
            //看number是否被整除就可以了
            if(number % i == 0){
                System.out.println(number + "不是一个质数");
                break;
            }else if(number % i != 0){
                System.out.println(number + "是一个质数");
                break;
            }
        }


    }
}
