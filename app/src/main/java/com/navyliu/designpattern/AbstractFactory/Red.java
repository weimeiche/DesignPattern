package com.navyliu.designpattern.AbstractFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("inside red::fill() method");
    }
}
