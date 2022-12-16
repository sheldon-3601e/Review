package com.arrays;

import java.util.Arrays;

/**
 * @author sheldon
 * @date 2022/12/15-16:48
 * 演示数组的使用
 */


public class Arrays_ {
    public static void main(String[] args) {

        String[] arr1 = new String[0];
        String[] arr2 = new String[2];
        for (int i = 0; i < 2; i++) {
            //System.out.println(arr1[i]);
            System.out.println(arr2[i]);
        }
        System.out.println("===================");
        //增强 for循环
        for (String str : arr2) {
            System.out.println(str);
        }
        System.out.println("===================");

        //复制数组
        int[] word = {1, 2, 3, 4};
        int[] copyWord = Arrays.copyOf(word, word.length + 3);
        for (int a : copyWord) {
            System.out.println(a);
        }
        System.out.println("===================");
        System.out.println(word.length);
        System.out.println(copyWord.length);


    }
}
