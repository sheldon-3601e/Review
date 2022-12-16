package com.scope_of_scope;

import org.testng.annotations.Test;

/**
 * @author sheldon
 * @date 2022/12/16-18:09
 * 演示作用域
 */
public class Scope_Of_Scope {

    int n1;
    public static void main(String[] args) {

        System.out.println();
    }

    @Test
    public void test(){
        //全局变量可以不赋值，直接使用
        System.out.println(n1);

        //局部变量必须要赋值
        //int n2;
        int n2 = 1;
        System.out.println(n2);
    }
}
