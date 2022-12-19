package com.Object_oriented.dynamic_binding;

/**
 * @author sheldon
 * @date 2022/12/19-10:48
 * 演示多态
 * 当调用对象方法时，会和该对象的运行类型绑定
 * 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
 */
public class DynamicBinding {

    public static void main(String[] args) {

        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}

class A {//父类
    public int i = 10;

    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10
    }

    public int sum1() {//父类 sum1()
        return i + 10;//10 + 10
    }

    public int getI() {//父类 getI
        return i;
    }
}

class B extends A {//子类
    public int i = 20;

    // public int sum() {
// return i + 20;
// }
    public int getI() {//子类 getI()
        return i;
    }
// public int sum1() {
// return i + 10;
// }
}