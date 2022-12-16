package com.arrays;

/**
 * @author sheldon
 * @date 2022/12/16-11:41
 * 冒泡排序
 */
public class SortOfBubble {
    public static void main(String[] args) {
        int[] arr = {32,65,12,43,11,76,87};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i :arr) {
            System.out.println(i);
        }

    }
}
