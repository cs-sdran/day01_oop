package com.chen.statictest;



public class test01 {
    public static void main(String[] args) {
        Student01 a=new Student01();
        a.name="张三";
        a.age=18;
        a.teachername="小王";
        System.out.println(a.name);

        Student01 b=new Student01();
        System.out.println(Student01.teachername);

    }
}
