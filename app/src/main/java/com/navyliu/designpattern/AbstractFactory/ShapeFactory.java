package com.navyliu.designpattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if ("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        if ("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
