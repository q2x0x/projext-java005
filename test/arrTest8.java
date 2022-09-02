package com.itheima.test;

public class arrTest8 {
    public static void main(String[] args) {

        //arrTest6.3

        //需求:
        //定义一个数组,存入1,2,3,4,5,交换首尾索引对应的元素
        //交换前:1,2,3,4,5,
        //交换后:5,4,3,2,1,

        //1.定义一个数组
       /* int[] arr = {1,2,3,4,5};

        //2.利用循环去交换数据
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            //交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
        //3.打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //去掉ln(打印不会换行); " "(使打印出来的数据清晰美观!)
        }
        */


        //exercise3.6(这样也可以反过来打印,but没有上面的方便)

        //1.定义数组
        int[] arr =  {1,2,3,4,5,};

        //2.定义一个第三方变量
        int temp = arr[0];

        //第四方变量
        int temp2 = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        arr[0] = arr[4];
        arr[4] = temp2;

        //第五方变量
        int temp3  =arr[3];
        arr[3] = arr[4];
        arr[4] = temp3;


        //3.循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
