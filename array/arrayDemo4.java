package com.itheima.array;

public class arrayDemo4 {
    public static void main(String[] args) {

        //需求:
        //定义一个数组,用来存班级的50名同学的姓名
        //姓名未知

        //格式:
        //数据类型[] 数组名 = new 数据类型[数组长度];
        //在创建的同时,由我们自己指定的数组的长度,由虚拟机给出默认的初始化值

        String[] arr = new String[50];

        //添加学生
        arr[0] = "张三" ;
        arr[1] = "李四";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印出来的是默认初始化值null

        //数组默认初始化的规律
        //整数类型:默认初始化值:0
        //浮点数类型:默认初始化值:0.0
        //字符类型:默认初始化值:'/u0000' (实际上就是空格,打印出来的时候)
        //布尔类型:默认初始化值:false
        //引用类型:默认初始化值:null

      int[] arr2 = new int [3];
      System.out.println(arr2[0]);
      System.out.println(arr2[1]);
      System.out.println(arr2[2]);






    }
}
