package com.constructor;

/**
 * @author sheldon
 * @date 2022/12/17-10:04
 * 演示构造器的使用
 */
public class Constructor {
    public static void main(String[] args) {
        test jake = new test("jake");
        System.out.println(jake.toString());
    }
}

class test{

    private String name;
    private int age;

    public test(String name){
        this.name = name;
          this.age = 18;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void info(){
        System.out.println(this.age);
    }
}
