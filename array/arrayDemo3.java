package com.itheima.array;

public class arrayDemo3 {
    public static void main(String[] args) {

        //1.定义数组
        int[] arr = {1,2,3,4,5};

        //2.获取数组里面的所有的元素
        //格式: 数组名[索引]

        //方法一

        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        //方法二

        //利用循环改进代码
        //开始条件:0
        //结束条件:数组长度 - 1 (最大索引)
        /*for (int i = 0; i <= 4; i++) {
            //i:0,1,2,3,4
            System.out.println(arr[i]);
        }*/

        //方法三(最终使用方法)

        //在java当中,关于数组的一个长度属性,length
        //调用方式:数组名.length
        //System.out.println(arr.length); //输出可以知道,定义数组有多少个元素

        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }



        //格外扩展:
        //快速生成数组方式
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
