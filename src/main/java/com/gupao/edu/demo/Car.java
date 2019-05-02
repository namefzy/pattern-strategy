package com.gupao.edu.demo;

/**
 * 具体策略父类
 */
public class Car implements CarFunction {
    protected String name;            //车名字
    protected String color;            //车颜色


    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color +" " + name  +"在行驶。。。");
    }

}