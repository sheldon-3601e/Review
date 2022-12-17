package com.constructor;

/**
 * @author sheldon
 * @date 2022/12/17-10:20
 */
public class test02 {
    public static void main(String[] args) {
            test002.test(1);
    }
}

class test002 {
    public static void test(int a) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < 100000; i++) {

            int b = (int) (Math.random() * 3);
            switch (b) {
                case 0:
                    n1++;
                    break;
                case 1:
                    n2++;
                    break;
                case 2:
                    n3++;
                    break;
            }
        }
        System.out.println(n1+" "+n2+" "+n3);
    }
}
