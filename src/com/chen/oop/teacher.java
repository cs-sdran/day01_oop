package com.chen.oop;

public class teacher {
    String name;
    int age;
    void teach(){
        System.out.println("老师"+name+"正在讲课");
    }
    void eat(){
        System.out.println("老师"+name+"正在吃东西");
    }
    // ... existing code ...
    /**
     * 老师睡觉的方法
     * 输出老师正在睡觉的信息
     */
    void sleep(){
        System.out.println("老师"+name+"正在睡觉");
    }
// ... existing code ...


}
