package com.itheima.test;

import java.util.Random;

public class arrTest5 {
    public static void main(String[] args) {

        //需求:
        /*
        生成10个1~100之间的随机数存入数组
        1)求出所有数据的和
        2)求出所有数据的平均数
        3)统计有多少个数据比平均值小
         */
        //分析:
        //1.定义数组
        int[] arr = new int[10];

        //2.把随机数存入数组中
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //循环一次就会产生一个新的数组数
            int number = r.nextInt(100) + 1;
            //把生成的数组数添加到数组数中
            //数组名[] = 数据
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //1)求出所有数据的和
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环得到每一个元素
            //并把元素添加到sun当中
            sum = sum + arr[i];
        }
        System.out.println("数组中的所有数据和为" + sum);

       //2)求出所有数据的平均数
        double  avg = sum / arr.length; //double 和 int 都可以
        System.out.println("数组中的数据平均数为" + avg);


        //3)统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("在数组中一共有" + count + "个数据比平均数小");


        //遍历数组,验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //将println后面的ln去掉,打印便在同一行上了
            //+ " " 是为了让打印的数据分开,不连在一起
        }


    }
}
