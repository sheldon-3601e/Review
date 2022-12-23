package com.Object_oriented.abstract_;

/**
 * @author sheldon
 * @date 2022/12/22-16:42
 * 演示抽象方法，抽象类
 */
public class test {
    public static void main(String[] args) {

    }
}

abstract class A{
    public void a(){}
    public abstract void b();
}

class B extends A{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
