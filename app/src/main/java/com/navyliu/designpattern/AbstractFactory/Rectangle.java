package com.navyliu.designpattern.AbstractFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Rectangle::draw() method.");
    }
}
