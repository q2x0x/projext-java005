package com.itheima.array;

public class arrayDemo1 {
    public static void main(String[] args) {
        //格式:
        //静态初始化:
        //完整格式:
        //数据类型[] 数组名 = new 数据类型[]{元素1,元素2...};
        //简化格式:
        //数据类型[] 数组名 = new{元素1...}

        //需求1:定义数组存储5个学生的年龄
        int[] array1 = {18,19,20};
        //需求2:定义数组存储5个学生的姓名
        String[] array2 = {"张三","李四","王二麻子"};
        //需求3:定义数组存储5个学生的身高
        double[] array3 = {1.70 , 1.17 , 1.180};
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);

        //扩展:
        //解释:地址的格式含义 [D@74a14482
        //[: 表示当前是一个数组
        //D: 表示当前数组里面的都是double类型的
        //@: 表示一个间隔符号 (固定格式)
        //4a14482: 这个才是数组真正的地址(十六进制的)
        //习惯将整个[D@74a14482叫做数组地址





    }
}
