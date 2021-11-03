package com.intern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Car myCar = new Car(424,"Qasim", 2017, "Sedan",0,1 );
        System.out.println("Starting Position");
        myCar.printStates();
        myCar.printDetails();
        System.out.println("Motion");
        myCar.changeGear(4);
        myCar.speedUp(250);
        myCar.printStates();
        System.out.println("Rest");
        myCar.applyBrakes();
        myCar.printStates();
    }
}
