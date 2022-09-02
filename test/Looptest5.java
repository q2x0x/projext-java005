package com.itheima.test;

import java.util.Random;

public class Looptest5 {
    public static void main(String[] args) {

        //Looptest4练习

        //需求:
        //1~100

        /*Random r = new Random();
        int number = r.nextInt(101);
        System.out.println(number);
        */

        //秘诀
        //用来生成任意数到任意数之间的随机数
        //1.让这个范围头尾都减去一个值,让这个范围从0开始
        //2.尾巴+1
        //3.最终的结果,再加上第一步减去的值


        /*Random r = new Random();
        int number = r.nextInt(9) + 7; // 7~15
        System.out.println(number);
        */

        /*Random r = new Random();
        int number = r.nextInt(100)+1;
        System.out.println(number);
        */

        //1~10
        /*Random r = new Random();
        int number = r.nextInt(10) + 1;
        System.out.println(number);
        */


        //5~12
        Random r = new Random();
        int number = r.nextInt(7) + 5;
        System.out.println(number);


    }
}
