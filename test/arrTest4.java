package com.itheima.test;

public class arrTest4 {
    public static void main(String[] args) {

        //需求:
        //定义数组最大值:33,5,22,44,55

        //发散思维:
        //1.将代码改成求最小值:
        //将max改成min,if(arr[i] > max)改成小于
        //2.为什么arr要记录arr[0],默认值不能为0吗?
        //不能写0 because当数组中的元素都为负数时,写0就会出错
        //max的初始化值一定要是数组中的值
        //3.循环中的开始条件一定是0 吗?
        //循环的开始条件如果是0,那么第一次循环的时候就是自己和自己比一下,效率低
        //为了提高效率,减少一次循环,循环开始可以写1


        //1.定义数组来存储5个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量max来存储最大值
        //临时认为0索引的数据是最大值
        int max = arr[0];
        //3.循环获取每一个元素
        //拿着每一个元素来与max进行比较
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.当循环结束之后,max记录的就是数组中最大值
        System.out.println(max);


    }
}
