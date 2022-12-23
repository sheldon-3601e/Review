package com.Object_oriented;

/**
 * @author sheldon
 * @date 2022/12/22-15:14
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello word");
        A a01 = new A();
        A a02 = new A();
        A a03 = new A();
    }
}

class A{
    //普通代码块会随着对象的创建，就加载一次
    {
        System.out.println("代码块");
    }

    //静态代码块只会加载一次
    static {
        System.out.println("静态代码块");
    }
    public int n1;

    public A() {
    }

    public void A01(){
        System.out.println("方法A01");
    }
}
