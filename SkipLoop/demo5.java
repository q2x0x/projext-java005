package com.itheima.SkipLoop;

public class demo5 {
    public static void main(String[] args) {

        //习题5

        /*
        定义一个数组来存储10个学生的成绩，
        例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
        计算并输出学生的平均成绩。

        训练提示:
        1、要操作数组的每一个元素，需要遍历。
        2、怎样求平均数？其实只要求和之后也就知道了平均数。

        解题方案:
        使用数组的遍历操作完成。

        操作步骤:
        定义保存学生成绩的数组arr。
        定义变量sum用来存储和。
        对数组进行遍历，求和。
        和除以元素个数得到平均数。
        打印结果。
         */


        //1.定义数组
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};

        //2.定义求和变量
        int sum = 0;

        //3.循环遍历
        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i];
        }//4.打印求和
        System.out.println("10个数的和是" + sum);

        //5.求平均数
        double avg = sum / arr.length;
        System.out.println("平均数是" + avg);


        //附加
        //打印出有多少是小于平均数的
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }//验证
        System.out.println("小于平均数的有" +  count + "个");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }






    }
}
