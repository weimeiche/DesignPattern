package com.navyliu.designpattern.AbstractFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside circle::draw() method");
    }
}
