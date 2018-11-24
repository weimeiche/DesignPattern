package com.navyliu.designpattern.FactoryPattern;

import android.graphics.drawable.shapes.RectShape;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public Shape getShapge(String shapeType){
        // equals:主要是区分“比较的字符串”大小写和长度，比较的类型可以是object
        // equalsIgnoreCase:比较的参数只能是字符串，这里只要字符串长度相等，字母的大小写是忽略的，认为A-Z和a-z是一样的
        if ("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Cirecle();
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
