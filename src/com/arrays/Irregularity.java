package com.arrays;

/**
 * @author sheldon
 * @date 2022/12/16-11:18
 * 演示创建一个不规则二维数组
 */
public class Irregularity {
    public static void main(String[] args) {
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];

        for (int i = 0; i <= NMAX; i++) {
            odds[i] = new int[i + 1];
        }

        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                int lotterOdds = 1;
                for (int k = 1; k <= j; k++) {
                    lotterOdds = lotterOdds * (i - k + 1) / k;
                }
                odds[i][j] = lotterOdds;
            }
        }

        for (int[] row :odds) {
            for (int odd :row) {
                System.out.print(odd +"\t");
            }
            System.out.println();
        }


    }
}
