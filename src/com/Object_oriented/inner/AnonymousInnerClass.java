package com.Object_oriented.inner;

/**
 * @author sheldon
 * @date 2022/12/23-10:06
 * <p>
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        outer01 outer01 = new outer01();
        outer01.m1();
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}

class outer01 {
    private int n1 = 10;

    public void m1() {
        Animal tiger = new Animal() {
            @Override
            void eat() {
                System.out.println("tiger");
            }
        };
        System.out.println(tiger.getClass());
        tiger.eat();
    }
}