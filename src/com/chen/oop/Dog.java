package com.chen.oop;

import java.sql.SQLOutput;

public class Dog {//面向对象创建小狗类
   private String name;
   private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void getname(){
        System.out.println(name);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void getAge(){
        System.out.println(age);
    }
}
