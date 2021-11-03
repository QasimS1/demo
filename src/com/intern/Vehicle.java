package com.intern;

public abstract class Vehicle {
    Integer id;
    String ownerName;
    Integer modelYear;

    public Vehicle(Integer id, String ownerName, Integer modelYear) {
        this.id = id;
        this.ownerName = ownerName;
        this.modelYear = modelYear;
    }
        public void printDetails() {
            System.out.println(" id:" + id + " ownerName:" + ownerName + "Model Year" + modelYear);
        }

}
