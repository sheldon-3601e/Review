package com.Object_oriented.abstract_;

/**
 * @author sheldon
 * @date 2022/12/22-17:00
 * <p>
 * 演示模板设计模式
 */
public class Template {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime(); //这里还是需要有良好的 OOP 基础，对多态
        BB bb = new BB();
        bb.calculateTime();
    }
}

abstract class Template1 {
    public abstract void job();//抽象方法

    public void calculateTime() {//实现方法，调用 job 方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定机制
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 " + (end - start));
    }
}

class AA extends Template1 {
    //计算任务
//1+....+ 800000
    @Override
    public void job() { //实现 Template 的抽象方法 job
        long num = 0;
        for (long i = 1; i <= 80000000; i++) {
            num += i;
        }
    }
}

class BB extends Template1 {
    public void job() {//这里也去，重写了 Template 的 job 方法
        long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num *= i;
        }
    }
}