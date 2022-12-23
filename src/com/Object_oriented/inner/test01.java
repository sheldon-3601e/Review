package com.Object_oriented.inner;

/**
 * @author sheldon
 * @date 2022/12/22-17:40
 * <p>
 * 内部类
 */
public class test01 {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.m2();
    }
}

class outer {

    private int n1 = 10;

    private void m1() {
        System.out.println(n1);
    }

    //演示局部内部类
    //1.局部内部类是定义在外部类的局部位置,通常在方法
    //3.不能添加访问修饰符,但是可以使用 final 修饰
    //4.作用域 : 仅仅在定义它的方法或代码块中
    public void m2() {
        class inner {
            private int n1 = 20;

            public void innerM1() {
                m1();

                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
                //使用 外部类名.this.成员）去访问
                System.out.println(n1);
                System.out.println(outer.this.n1);
            }
        }
        inner inner = new inner();
        inner.innerM1();
    }
}
