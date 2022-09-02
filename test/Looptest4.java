package com.itheima.test;

//导包
import java.util.Random;

public class Looptest4 {
    public static void main(String[] args) {

        //先获取一个随机数
        //范围:0~10

        //2.创建对象
        Random r = new Random ();

        //3.生成随机数
        //判断技巧:
        //在这个小括号里输入的数字是从0开始的
        //到这个数字减1结束
        //口诀:包头不包尾,包左不包右
        int number = r.nextInt(10);//0~9

        System.out.println(number);
    }
}
