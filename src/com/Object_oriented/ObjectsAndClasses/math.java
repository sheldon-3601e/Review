package com.Object_oriented.ObjectsAndClasses;

/**
 * @author sheldon
 * @date 2022/12/16-14:36
 */
public class math {

    public static int[] resp(int n1,int n2){
        int[] resl = new int[3];
        resl[0] = n1 + n2;
        resl[1] = n1 - n2;
        resl[2] = n1 * n2;
        return resl;
    }

    //判断奇数偶数
    public static boolean judge(int n1){
        if (n1 % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
