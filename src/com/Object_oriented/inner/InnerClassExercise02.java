package com.Object_oriented.inner;

/**
 * @author sheldon
 * @date 2022/12/23-10:25
 *
 * 匿名内部类的练习
 *
 * 1.有一个铃声接口 Bell，里面有个 ring 方法。(右图)
 * 2.有一个手机类 Cellphone，具有闹钟功能 alarmClock，参数是 Bell 类型(右图)
 * 3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印：懒猪起床了
 * 4.再传入另一个匿名内部类(对象)，打印：小伙伴上课了
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell{
    public void ring();
}

class Cellphone{

    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }

}
