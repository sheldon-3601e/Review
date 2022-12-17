package com.Object_oriented.ObjectsAndClasses;

/**
 * @author sheldon
 * @date 2022/12/16-14:53
 */
public class test {

    public void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 + " " + n2);
    }

    public void update(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    //方法重载
    public static void m(int n1){
        System.out.println(n1 * n1);
    }
    public static void m(int n1,int n2){
        System.out.println(n1 * n1 + n2 * n2);
    }

    //使用可变参数来优化以上方法
    public static void mm(int ...n){
        int resl = 0;
        for (int i = 0; i < n.length; i++) {
            resl += n[i] * n[i];
        }
        System.out.println(resl);
    }
}
