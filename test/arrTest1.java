package com.itheima.test;

public class arrTest1 {
    public static void main(String[] args) {

        //需求:
        //定义一个数组,存储1,2,3,4,5
        //遍历数组得到每一个元素,求数组所有的数据之和

        //分析:

        //1.定义一个数组,开始数据1,2,3,4,5
       /* int[] arr = {1,2,3,4,5};

       //定于一个求和变量
        int sun = 0;

        //2.遍历数组得到每一个数据累加求和
        for (int i = 0; i < arr.length; i++) {
            //i:依次表示数组里的每一个索引;
            //arr[]:依次表示数组里的每一个元素;
            sun = sun + arr[i];
        }
        System.out.println(sun); */



        //练习:

        //需求:
        //定义一个数组,存储1,2,3,4,5
        //遍历数组得到每一个元素,求数组所有的数据之和

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sun = 0;
        for (int i = 0; i < arr.length; i++) {
            sun = sun + arr[i];
        }
        System.out.println(sun);









    }
}
