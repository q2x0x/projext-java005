package com.itheima.test;

public class arrTest6 {
    public static void main(String[] args) {

        //arrTest6.1

        //需求:
        //定义两个变量,交换两个变量记录的值

       /* int a = 100;
        int b = 200;

        //定义一个临时第三方变量
        //把变量a的值赋值给temp
        int temp = a;

        //把变量b的值赋值给a,那么变量a原来记录的值就被覆盖了
        a=b;

        //就是把变量a原来的值,赋值给变量b
        b = temp;
        System.out.println(a);
        System.out.println(b);*/



       //exercise1.6

       //1.定义一个数组
       int q = 20;
       int x = 120;

       //2.定义一个第三方变量
       //将a赋值给第三方变量
       int temp = q;
       q = x;
       x = temp;

       //3.打印
        System.out.println(q);
        System.out.println(x);






















    }
}
