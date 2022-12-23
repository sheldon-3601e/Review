package com.Object_oriented.inner;

/**
 * @author sheldon
 * @date 2022/12/23-10:36
 *
 * 成员内部类
 *
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();

        //得到成员内部类的三种方法
        //第一种方式
        // outer.new Inner() 相当于把 new Inner()当做是 outer 成员
        // 这就是一个语法，不要特别的纠结.
        Outer.Inner inner = outer.new Inner();
        inner.m2();

        // 第二方式 在外部类中，编写一个方法，可以返回 Inner 对象
        Outer.Inner inner1 = outer.getInner();
    }
}

class Outer{
    private int n1 = 10;

    public class Inner{
        private int n2 = 20;

        public void m2(){
            System.out.println(n2);
        }
    }

    public void m1(){
        System.out.println(n1);
    }

    public Inner getInner(){
        return new Inner();
    }

}
