package com.itheima.infiniteloop;

public class infiniteloopDemo2 {
    public static void main(String[] args) {

        //infiniteloopDemo2和infiniteloopDemo3应该是在SkipLoop包里

        //第三个有虫,得跳过不吃

        //1.跳过某一次循环
        // 5.fori   是第八行代码的快捷输入方式!
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
               //continue:结束本次循环,继续执行下一次循环
                continue;
            }
            System.out.println("小脑斧在吃第" + i + "个包子");
        }
    }
}
