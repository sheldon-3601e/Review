package com.Object_oriented.interface_;

/**
 * @author sheldon
 * @date 2022/12/22-17:11
 *
 * 接口
 */
public class test01 {
}

interface A{
    public void start();
    public void stop();

}

class B implements A{

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

//抽象类实现接口，可以不用实现方法
abstract class C implements A{
    abstract public void m();
}

class D extends C{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void m() {

    }
}
