package com.Object_oriented.ploy_array;

/**
 * @author sheldon
 * @date 2022/12/19-11:00
 */
public class Teacher extends People{
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("老师说");
    }

    public void tea(){
        System.out.println("老师");
    }
}
