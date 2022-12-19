package com.Object_oriented.poly_morphism;

/**
 * @author sheldon
 * @date 2022/12/19-10:22
 * 演示多态
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("jake", "red");
        Rice rice = new Rice("Rice");
        new Master("tom").feed(cat,rice);

        Animal cat1 = new Cat("smith","bule");
        Cat cat2 = (Cat) cat1;
        cat2.showCat();
//        System.out.println(cat1.getClass());
//        Animal cat2 = (Animal) cat1;
//        System.out.println(cat2.getClass());

//        Cat cat2 = (Cat) cat1;
//        System.out.println(cat2.getClass());


    }
}
