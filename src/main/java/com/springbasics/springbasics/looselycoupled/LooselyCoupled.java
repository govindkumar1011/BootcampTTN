package com.springbasics.springbasics.looselycoupled;
//(2) Write a program to demonstrate Loosely Coupled code.
interface Journey {
    void startJourneyBy();
}

class Car implements Journey {


    public void startJourneyBy() {
        System.out.println("Journey by car");

    }

}

class Bike implements Journey {


    public void startJourneyBy() {
        System.out.println("Journey by bike");

    }
}


public class LooselyCoupled {
    Journey journey;
    LooselyCoupled (Journey journey)
    {

        this.journey=journey;
    }
    public void run()
    {
        journey.startJourneyBy();
    }
    public static void main(String[] as) {
        LooselyCoupled looselyCoupled=new LooselyCoupled(new Bike());
        looselyCoupled.run();


    }
}
