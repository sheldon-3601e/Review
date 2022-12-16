package com.ObjectsAndClasses;

import java.util.Date;

/**
 * @author sheldon
 * @date 2022/12/16-11:57
 * 演示类
 */
public class Objects_and_Classes {
    public static void main(String[] args) {

        People[] people = new People[3];

        people[0] = new People(1,"jake",200);
        people[1] = new People(2,"tom",300);
        people[2] = new People(3,"smith",400);

        for (People people1 :people) {
            System.out.println(people1);
        }

        //对象引用的是在堆中的地址
        people[1] = people[0];
        System.out.println(people[0].hashCode());
        System.out.println(people[1].hashCode());

        int[] resp = math.resp(3, 4);
        for (int i :resp) {
            System.out.println(i);
        }

    }
}
