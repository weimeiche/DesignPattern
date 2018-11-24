package com.navyliu.designpattern;

import android.annotation.NonNull;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        在核心java中，主要有三种类型的设计模式，它们可进一步分为以下子部分：
//
//        1. 创造设计模式
//
//                工厂模式
//        抽象工厂模式
//                单例模式
//        原型模式
//                Builder模式
//
//        结构设计模式
//
//        适配器（Adapter）模式
//        桥接（Bridge）模式
//                组合模式
//        装饰者（Decorator）模式
//        外观（Facade）模式
//        享元（Flyweight）模式
//        代理（Proxy）模式
//
//                行为设计模式
//
//        责任链模式
//                命令模式
//        解释器模式
//                迭代器模式
//        调解者(Mediator)模式
//                备忘录模式
//        观察者模式
//                状态模式
//        策略模式
//                模板模式
//        访问者模式的设计模式，它们可进一步分为以下子部分：
//
//        1. 创造设计模式
//
//                工厂模式
//        抽象工厂模式
//                单例模式
//        原型模式
//                Builder模式
//
//        结构设计模式
//
//        适配器（Adapter）模式
//        桥接（Bridge）模式
//                组合模式
//        装饰者（Decorator）模式
//        外观（Facade）模式
//        享元（Flyweight）模式
//        代理（Proxy）模式
//
//                行为设计模式
//
//        责任链模式
//                命令模式
//        解释器模式
//                迭代器模式
//        调解者(Mediator)模式
//                备忘录模式
//        观察者模式
//                状态模式
//        策略模式
//                模板模式
//        访问者模式
    }

    private static float sNoncompatDensity;
    private static float sNoncompatScaledDensity;

    private static void setCustomDensity(@NonNull Activity activity, @NonNull final Application application){
        final DisplayMetrics appDisplayMetrics = application.getResources().getDisplayMetrics();

        if (sNoncompatDensity == 0){
            sNoncompatDensity = appDisplayMetrics.density;
            sNoncompatScaledDensity = appDisplayMetrics.scaledDensity;
            application.registerComponentCallbacks(new ComponentCallbacks() {
                @Override
                public void onConfigurationChanged(Configuration newConfig) {
                    if (newConfig != null && newConfig.fontScale > 0){
                        sNoncompatScaledDensity = application.getResources().getDisplayMetrics().scaledDensity;
                    }
                }

                @Override
                public void onLowMemory() {
                }
            });
        }

        final float targetDensity = appDisplayMetrics.widthPixels/360;
        final float targetScaledDensity = targetDensity * (sNoncompatScaledDensity / sNoncompatDensity);
        final  int targetDensityDpi = (int)(160 * targetDensity);

        appDisplayMetrics.density = targetDensity;
        appDisplayMetrics.scaledDensity = targetScaledDensity;
        appDisplayMetrics.densityDpi = targetDensityDpi;

        final DisplayMetrics activityDisplayMetrics = activity.getResources().getDisplayMetrics();
        activityDisplayMetrics.density = targetDensity;
        activityDisplayMetrics.scaledDensity = targetScaledDensity;
        activityDisplayMetrics.densityDpi = targetDensityDpi;
    }

































}
