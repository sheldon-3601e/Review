package com.Object_oriented.constructor;

/**
 * @author sheldon
 * @date 2022/12/17-10:13
 */
public class test01 {
    public static void main(String[] args) {
        Person jake = new Person(12, "jake");
        Person tom = new Person(12, "jake");
        System.out.println(jake.compareTo(tom));
    }
}

class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //用来比较两个人是否相等
    public boolean compareTo(Person person){
        if (this.age == person.age && this.name.equals(person.name)){
            return true;
        } else {
            return false;
        }
    }
}