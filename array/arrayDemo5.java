package com.itheima.array;

public class arrayDemo5 {
    public static void main(String[] args) {

        //定义一个数组
        int[] arr = {1,2,3,4,5};
        //长度:5
        //最小索引:0
        //最大索引:4
        System.out.println(arr[1]);

        //小结
        //索引越界异常
        //原因:访问了不存在的索引
        //避免:索引的范围
        //最小索引:0
        //最大索引:4(数组的长度 - 1)
    }
}
