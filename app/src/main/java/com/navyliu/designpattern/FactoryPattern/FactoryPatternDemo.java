package com.navyliu.designpattern.FactoryPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class FactoryPatternDemo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of circle and call its draw method
        Shape circle = shapeFactory.getShapge("CIRCLE");
        // call draw method of circle
        circle.draw();

        // get an object of Rectangle and call its draw method
        Shape rectangle = shapeFactory.getShapge("RECTANGLE");
        // call draw method of rectangle
        rectangle.draw();

        // get an object of square and call its draw method
        Shape square = shapeFactory.getShapge("SQUARE");
        // call draw method of circle
        square.draw();
    }

}
