package com.navyliu.designpattern.AbstractFactory;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("inside blue::fill() method");
    }
}
