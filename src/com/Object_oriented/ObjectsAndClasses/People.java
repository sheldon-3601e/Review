package com.Object_oriented.ObjectsAndClasses;

/**
 * @author sheldon
 * @date 2022/12/16-14:11
 */
public class People {
    private int id;
    private String name;
    private double price;

    public People(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static People copyPeople(People people){
        return people;
    }
}
