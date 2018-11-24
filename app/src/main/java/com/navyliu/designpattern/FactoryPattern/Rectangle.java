package com.navyliu.designpattern.FactoryPattern;

public class Rectangle implements Shape {
    // 长方形
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
