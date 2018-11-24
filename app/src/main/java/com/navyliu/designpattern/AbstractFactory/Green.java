package com.navyliu.designpattern.AbstractFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("inside Green::fill() method");
    }
}
