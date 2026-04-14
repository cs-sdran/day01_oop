package com.chen.oop;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

public class test01 {
  /*  public static void main(String[] args) {//描述一类事物的类叫javabean
        *//*Dog d1=new Dog();
        d1.name="小白";
        d1.age=5;
        d1.color="白色";
        d1.weight=10.0;
        System.out.println(d1.age);
        System.out.println(d1.name);
        System.out.println(d1.weight);
        System.out.println(d1.color);*//*

        teacher a=new teacher();
        a.name="sun";
        a.age=33;
        a.eat();
        a.sleep();
        a.teach();
    }*/

    //private关键字，只能由本类访问
 /*   public static void main(String[] args) {
        Dog d1=new Dog();
        d1.setName("xiaobai");
        d1.getname();
    }*/

    public static void main(String[] args) {
        Student a=new Student();
        a.setName("张三");
        a.setAge(18);
        a.setHeight(183);
        a.setWeight(60);
        a.xingwei();
        System.out.println(a.getName());
        //大二期间
        double nowweight=0;
        nowweight=a.getWeight();
        nowweight+=10;
        a.setWeight(nowweight);
        int nowage=0;
        nowage=a.getAge();
        nowage++;
        a.setAge(nowage);
        //减肥成功
        nowweight=a.getWeight()-3;
        a.setWeight(nowweight);
        double nowheight=a.getHeight()+2;
        a.setHeight(nowheight);
        nowage=a.getAge()+1;
        a.setAge(nowage);


        System.out.println(a.getName()+a.getWeight()+a.getAge()+a.getHeight());
    }
}
