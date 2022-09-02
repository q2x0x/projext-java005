package com.itheima.infiniteloop;

public class infiniteloopDemo3 {
    public static void main(String[] args) {

        //infiniteloopDemo2和infiniteloopDemo3应该是在SkipLoop包里

        //吃了三个就饱了;

        for (int i = 1; i <= 5; i++) {
            System.out.println("小脑斧在吃第" + i + "个包子");
            if (i == 3){
                //结束循环
                break;
            }
        }
    }
}
