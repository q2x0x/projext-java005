package com.itheima.test;

import java.util.Random;

public class arrTest9 {
    public static void main(String[] args) {

        //需求:
        //定义一个数组,存入1~5,要求打印数组中的所有数据

        //难点:
        //如何获得索引
        /*int[] arr = {1,2,3,4,5};
        //索引范围:0,1,2,3,4
        Random r = new Random();
        int randomdex = r.nextInt(arr.length);
        System.out.println(randomdex);
        */

        //1.定义数组存储1~5
        int[] arr = {1,2,3,4,5};

        //2.遍历循环数组,从0索引开始打乱数据顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomdex = r.nextInt(arr.length);
            //拿着随机索引指向的元素跟i指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomdex];
            arr[randomdex] = temp;

        }
        //当循环结束之后,那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
