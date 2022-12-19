package com.Object_oriented.poly_morphism;

/**
 * @author sheldon
 * @date 2022/12/19-10:20
 */
public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Rice extends Food{
    public Rice(String name) {
        super(name);
    }
}

class Fruit extends Food{
    public Fruit(String name) {
        super(name);
    }
}
