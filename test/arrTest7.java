package com.itheima.test;

public class arrTest7 {
    public static void main(String[] args) {

        //arrTest6.2

        //需求:
        //定义一个数组,将0索引和最大索值引进行交换

        //定义一个数组
        /*int[] arr = {1,2,3,4,5};

        //将数组中的0索引和最大索引值进行交换
        //利用第三方变量进行交换

        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/



        //exercise2.6

        //1.定义数组
        int[] arr =  {1,2,3,4,5,};

        //2.定义一个第三方变量
        int temp = arr[0];

        arr[0] = arr[4];
        arr[4] = temp;

        //3.循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }









    }
}
