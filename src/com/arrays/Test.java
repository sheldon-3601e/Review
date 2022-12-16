package com.arrays;

import java.util.Arrays;

/**
 * @author sheldon
 * @date 2022/12/16-11:02
 */
public class Test {
    public static void main(String[] args) {
        int[] tite = new int[50];
        int[] resls = new int[6];
        for (int i = 0; i < 6; i++) {
            int resl = (int)(Math.random() * 50);
            if (tite[resl] != 1){
                tite[resl] = 1;
                resls[i] = resl;
            } else {
                i--;
            }
        }
        for (int a :resls) {
            System.out.println(a);
        }
        System.out.println("==========");
        Arrays.sort(resls);
        for (int a :resls) {
            System.out.println(a);
        }

    }
}
