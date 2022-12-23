package com.enum_;

/**
 * @author sheldon
 * @date 2022/12/23-14:28
 */
public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SWINNER);
    }
}

enum Season{

    SPRING("春天","温暖"),SWINNER("夏天","炎热");

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
