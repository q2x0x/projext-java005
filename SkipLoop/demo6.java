package com.itheima.SkipLoop;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {

        //习题6

        /*
        题目6（很难）
        有一个数组，其中有十个元素从小到大依次排列
        {12,14,23,45,66,68,70,77,90,91}。
        再通过键盘录入一个整数数字。要求：
        把数字放入数组序列中，生成一个新的数组，
        并且数组的元素依旧是从小到大排列的。执行效果如下：

        请输入一个整数数字：
        50
        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91

        训练提示
        数组的长度是不能改变的，所以增加一个元素需要定义一个新数组。
        数组元素是从小到大排列的，如何找到新元素存放的位置？

        解题方案
        ​用数组的遍历，用元素依次和数字作比较，找到正确的存放位置。

        操作步骤
        定义原数组arr，和一个比原数组长度大1的新数组brr。
        通过键盘录入的方式输入变量num的值。
        定义变量index用于记录num存放的索引位置。
        遍历数组，小于或等于num的元素直接存放到原来的位置，大于num的元素往后移动一个位置。
        存放结束之后，中间会空出一个位置,在遍历时用index记录这个位置。把num放在这个索引处。
        最终遍历新数组打印结果。
         */

        //1.定义原数组arr
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};

        //2.定义个长度为11的空数组
        int[] brr = new int[11];

        //3.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();

        //4.定义变量index用于记录num存放的索引位置
        int index = 0;

        //5.循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                //5.1如果元素小于等于要插入的数字,则直接放入
                brr[i] = arr[i];
                //5.2把i后面的位置记录下来
                index = i + 1;
            } else {
                //5.3如果元素大于要插入的数字,则往后一位存放
                brr[i + 1] = arr[i];
            }
        }
        //6.index存储的就是要插入的位置
        brr[index] = num;
        //7.遍历新对的数组查看结果
        System.out.println("生成新的数组是:");
        for (int i = 0; i < brr.length; i++) { //在此将brr输成了arr 以至于打印出错,一定要细心呀!
            System.out.print(brr[i] + " ");
        }
    }
}
