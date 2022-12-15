package com.datatype;

/**
 * @author sheldon
 * @date 2022/12/15-15:07
 */
public class DataType {

    //声明全局常量
    public static final int WORD = 32;

    public static void main(String[] args) {

        //使用float ,要在数字后面加 f
        float f = 3.14f;
        System.out.println(f);

        //数字后面不加 f ，则默认为 double 类型
        double d1 = 3.14;
        double d2 = 3.14d;
        System.out.println(d1 + "\t" + d2);

        int i, j;
        i = 1;
        j = 2;
        System.out.println(i + j);

        //三元运算符
        System.out.println(1 < 2 ? "true" : "false");

        //字符串拼接
        String str = "hello word";
        String str1 = str.substring(0, 3);
        System.out.println(str1);
        String str2 = str.substring(3, 6);
        System.out.println(str2);
        System.out.println(str1 + str2);

        //任意类型与字符串类型拼接，会转换成字符串类型
        int a = 123;
        String s = "hello";
        System.out.println((a + s).getClass());   //现在为 String类型

        //比较字符串
        str1 = "hello word";
        str2 = "Hello Word";
        System.out.println(str1.equals(str2));  //false
        //该方法会忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));  //true

        //构造字符串构造器
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);
        stringBuilder.append("\thello StringBulider");
        System.out.println(stringBuilder.toString());


    }
}
