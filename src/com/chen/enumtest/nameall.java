package com.chen.enumtest;

public enum nameall {
    XIAOMING("小明"),
    XIAOHONG("小红"),
    XIAOLI("小李");
    private String name;

    nameall(String name) {//枚举类的构造方法默认使用private修饰
        System.out.println("枚举类构造方法");
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
