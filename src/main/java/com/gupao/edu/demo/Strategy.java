package com.gupao.edu.demo;

/**
 * 运行环境类
 */
public class Strategy {
    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎","黑色");
        Car bussCar = new BussCar("公交车","白色");
        Person p1 = new Person("小明", 20);
        p1.driver(smallCar);
        p1.driver(bussCar);
    }
}
