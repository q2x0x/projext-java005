package com.itheima.SkipLoop;

public class demo2 {
    public static void main(String[] args) {

        //练习题2

        /*
        现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。
        请编写代码，找出数组中的最小值并打印。

        训练提示
        1、数组的元素是小数，需要定义小数类型数组。
        2、找最值需要先定义一个参考值，然后依次拿每个值与参考值比较即可。

        解题方案:
        将数组的第一个值作为参考值，遍历数组，依次比较，记录更小值。

        操作步骤:
        1、定义double类型数组并存入元素。
        2、定义double类型变量min代表最小值，初始化为数组第一个值。
        3、遍历数组，用每个元素依次和变量min对比。
        4、如果发现有元素小于min，则把该元素赋值给min。
        5、遍历结束之后min记录的就是最小值，打印结果。
         */

        //1.定义一个数组
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        //2.定义统计变量
        double  min = arr[0]; //这地方的类型要和定义数组的类型一致才行
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }//打印输出
        System.out.println("最小值是:" + min);











    }
}
