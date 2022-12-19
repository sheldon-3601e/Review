package com.Object_oriented.ploy_array;

/**
 * @author sheldon
 * @date 2022/12/19-11:01
 */
public class Student extends People{
    public Student(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("学生说");
    }

    public void stu(){
        System.out.println("学生");
    }
}
