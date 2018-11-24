package com.navyliu.designpattern.AbstractFactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class AbstractFactoryPatternDemo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // get shape factory
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
    }
}
