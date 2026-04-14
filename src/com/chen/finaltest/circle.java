package com.chen.finaltest;

public class circle {
    private double radius;
    private final double PI=3.14;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() { //计算圆面积
        return PI*radius*radius;
    }
    public double getCircumference() { //计算圆周长
        return 2*PI*radius;
    }

}
