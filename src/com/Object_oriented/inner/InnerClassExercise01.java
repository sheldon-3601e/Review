package com.Object_oriented.inner;

/**
 * @author sheldon
 * @date 2022/12/23-10:21
 *
 * 匿名内部类的最佳实践，当做一个对象传递
 *
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        Standard inner = new Standard() {
            @Override
            public void m1() {
                System.out.println("匿名内部类");
            }
        };
        inner.m1();
    }
}

interface Standard{
    public void m1();
}

