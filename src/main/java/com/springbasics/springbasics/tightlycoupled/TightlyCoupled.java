package com.springbasics.springbasics.tightlycoupled;
//(1) Write a program to demonstrate Tightly Coupled code.

class Car {

    public void goByCar() {
        System.out.println("going by car");
    }
}

class Bike {

    public void goByBike() {
        System.out.println("going by bike");
    }
}

public class TightlyCoupled {
    public static void main(String[] as) {
        Car car = new Car();
        car.goByCar();
    }
}
