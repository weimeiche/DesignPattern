package com.navyliu.designpattern.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if ("RED".equalsIgnoreCase(color)){
            return new Red();
        }
        if ("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }
        if ("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
