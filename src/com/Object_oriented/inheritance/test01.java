package com.Object_oriented.inheritance;

/**
 * @author sheldon
 * @date 2022/12/17-10:45
 * 演示继承
 */
public class test01 {
    public static void main(String[] args) {
        new Son().test();
    }
}

class Father{
    private int n1 = 10;
    public Father() {
        System.out.println("父类无参构造器被调用");
    }
    public int getN1(){
        return this.n1;
    }

    public void test(){
        System.out.println("12");
    }
}

class Son extends Father{
    public Son() {
        System.out.println("子类无参构造器");
        System.out.println(super.getN1());
    }

    @Override
    public void test() {
        System.out.println("21");
    }
}