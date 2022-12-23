package com.Object_oriented.interface_;

/**
 * @author sheldon
 * @date 2022/12/22-17:22
 *
 * 演示接口的多态
 */
public class Poly {
    public static void main(String[] args) {
        A01 a01 = new B01();
        a01.start();
        a01 = new C01();
        a01.start();

        A01[] a01s = new A01[3];
        a01s[0] = new B01();
        a01s[1] = new C01();
        a01s[2] = new B01();
        System.out.println("================");

        for (int i = 0; i < a01s.length; i++) {
            a01s[i].start();
            if (a01s[i] instanceof B01){
                ((B01) a01s[i]).extra();
            }
        }

    }
}

interface A01{
    public void start();
    public void stop();
}

class B01 implements A01{

    @Override
    public void start() {
        System.out.println("B开始");
    }

    @Override
    public void stop() {

    }

    public void extra(){
        System.out.println("B_extra");
    }
}

class C01 implements A01{

    @Override
    public void start() {
        System.out.println("C开始");
    }

    @Override
    public void stop() {

    }
}