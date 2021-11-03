package com.intern;

public class Car extends Vehicle implements VehicleFeatures  {
        String carType;
        Integer speed = 0;
        Integer gear = 1;
        // implementation
        @Override
        public void changeGear(Integer newValue) {
            gear = newValue;
        }
        @Override
        public void speedUp(Integer increment) {
            speed = speed + increment;
        }
        @Override
        public void applyBrakes() {
            speed = 0;
            gear = 0;
        }
        void printStates() {
            System.out.println(" speed:" + speed + " gear:" + gear);
        }

        //constructor

    public Car(Integer id, String ownerName, Integer modelYear, String carType, Integer speed, Integer gear) {
        super(id, ownerName, modelYear);
        this.carType = carType;
        this.speed = speed;
        this.gear = gear;
    }

}
