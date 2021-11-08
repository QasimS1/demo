package com.generic;

public class Employee extends MyGeneric{
    Integer id;
    String name;
    String department;


    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
