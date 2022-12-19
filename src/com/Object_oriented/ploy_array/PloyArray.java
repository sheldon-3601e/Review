package com.Object_oriented.ploy_array;

/**
 * @author sheldon
 * @date 2022/12/19-10:59
 * 多态数组
 */
public class PloyArray {
    public static void main(String[] args) {

        People[] peoples = new People[3];
        peoples[0] = new Teacher("jake");
        peoples[1] = new Student("tom");
        peoples[2] = new Teacher("smith");

        for (int i = 0; i < 3; i++) {
            peoples[i].say();
            if (peoples[i] instanceof Student) {
                ((Student) peoples[i]).stu();
            } else if (peoples[i] instanceof Teacher) {
                ((Teacher) peoples[i]).tea();
            }
        }
    }
}
