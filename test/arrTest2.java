package com.itheima.test;

public class arrTest2 {
    public static void main(String[] args) {
       
        //定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        //遍历数组得到每一个元素,统计里面一共有多少个能被3整除的数字

        //分析:
        //定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //定义一个变量来统计次数
        int count = 0;

        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i:依次表示数组里的每一个索引;
            //arr[]:依次表示数组里的每一个元素;
            //3.判断当前的元素是否为3的倍数,如果是,那么统计变量需要自增一次
            if(arr[i] % 3 == 0){
                //System.out.println(arr[i]);
                count++;
            }
        }
        //当循环结束之后,就表示所有的数字都判断完毕了,直接打印count即可
        System.out.println("数组中能被3整除的数一共有" + count + '个' + '!');
    }
}
