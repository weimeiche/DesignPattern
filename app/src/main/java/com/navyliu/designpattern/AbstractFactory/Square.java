package com.navyliu.designpattern.AbstractFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Square::draw() method");
    }
}
