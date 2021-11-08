package com.generic;

public class Engineer extends Employee{
    Integer id;
    String name;
    String department;

    public Engineer(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
