package com.chen.enumtest;

public class test01 {
    public static void main(String[] args) {
        nameall xiaoli = nameall.XIAOLI;
        System.out.println(xiaoli.getName());
        nameall[] values = nameall.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].getName());
        }
    }
}
