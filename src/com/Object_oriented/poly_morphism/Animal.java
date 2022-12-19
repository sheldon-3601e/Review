package com.Object_oriented.poly_morphism;

/**
 * @author sheldon
 * @date 2022/12/19-10:19
 */
public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void show(){
        System.out.println("父类方法");
    }
}

class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    public void showCat() {
        System.out.println("子类方法");
    }
}

class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }
}
