package com.navyliu.designpattern.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if ("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }
        if ("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
