package com.itheima.SkipLoop;

public class demo7 {
    public static void main(String[] args) {

        //习题7

        /*
        题目7（很难）
        定义一个数组其中包含多个数字。用自己的方式最终实现，
        奇数放在数组的左边，偶数放在数组的右边。
        （可以创建其他数组，不必须在原数组中改变）

        训练提示
        要找奇数和偶数只需要判断对2取余即可。
        找到一个奇数或偶数之后，把它放在哪个索引处？

        解题方案
        1.定义一个新数组。把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边。
        2.不定义新数组。找到左边的偶数，和右边的奇数互换位置。

        以下以方案1为准

        操作步骤
        定义出原数组arr，其中包含多个数字。
        定义新数组brr，和arr的长度一样。
        定义变量left，初始值是0准备从左边放元素，定义变量right，初始值是arr.length-1准备从右边放元素。
        对原数组arr进行遍历。
        如果元素是奇数，则放在新数组brr的左边，left变量加一。
        如果元素是偶数，则放在新数组brr的右边，right变量减一。
        遍历新数组brr打印最终结果。
         */

        //1.定义原数组arr
        int[] arr = {12,34,11,43,56,78,89,54};

        //2.定义新的数组brr
        int[] brr = new int[arr.length];

        //3.定义变量代表奇数要存放的位置
        int left = 0;

        //4.定义变量代表偶数要存放的位置
        int right = arr.length - 1;

        //5.对数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                //5.1如果是奇数就往左边放
                brr[left] = arr[i];
                //5.2存放之后让索引向右移动
                left++;
            }else{
                //5.3如果是偶数就往右边放
                brr[right] = arr[i];
                //5.4存放之后让索引向左移动
                right--;
            }
        }
        //6.打印brr数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
