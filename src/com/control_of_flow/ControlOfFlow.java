package com.control_of_flow;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @author sheldon
 * @date 2022/12/15-16:22
 * 演示流程控制
 */
public class ControlOfFlow {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Double balance = 500d;
        int tite = 700;
        int year = 0;
        int loop = 0;

        while (balance < tite) {
            System.out.println(balance);
            System.out.println(year);
            System.out.println("现在是否要退休(1为退休)：");
            loop = scanner.nextInt();
            if (loop == 1) {
                break;
            } else {
                year++;
                balance = balance * 1.2;
            }
        }*/

        /*int resl = 1;
        int k = 6;
        //演示50个数中抽取6个数的中奖可能
        for (int i = 1; i <= k; i++) {
            resl = resl * (50 - i + 1) / i;
        }
        System.out.println(resl);*/

        //演示跳出多重循环时的标签作用
        //在不使用标签时，break仅仅跳出内层循环
        for (int i = 0; i < 3; i++) {
            System.out.println("out" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("in" + j);
                if (j == 1){
                    break;
                }
            }
        }
        System.out.println("=====================");

        //使用break 标签,直接跳出外层循环
        read_date:
        for (int i = 0; i < 3; i++) {
            System.out.println("out");
            for (int j = 0; j < 3; j++) {
                System.out.println("in");
                if (j == 1){
                    break read_date;
                }
            }
        }

    }

}
