package com.example.quze2;

public class Employee {
    String name;
    float salary;
    String time;

    public Employee() {
    }

    public Employee(String name, float salary,String time) {
        this.name = name;
        this.salary = salary;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
