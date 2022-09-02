package com.itheima.test;

import java.util.Scanner;

public class Looptest2 {
    public static void main(String[] args) {

        //需求:键盘录入一个大于等于2的整数x,计算返回x的平方根.
        //结果保留整数部分,小数部分舍去

        //分析:
        //例: 16的平方根=4
        //    25的平方根=5
        //    20的平方根=4.472135954999579


        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();

        //2.从1开始判断
        //开始条件:1
        //结束条件:number
        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number比较
            if (i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了,循环就可以停止了,后面的数字就不用在寻找了,提高代码的运行效率
                break;
            }else if(i * i > number){
                System.out.println((i-1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }

    }
}
