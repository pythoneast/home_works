package com.company;

public class Cat {
    String name;
    double weight;
    int age;

    public void setName(String n) {
        name = n;
    }

    public void setWeight(double w) {
        if (w > 0) {
            weight = w;
        } else {
            System.out.println("Weight must be bigger than 0!");
        }
    }

    public void setAge(int a) {
        if (a >= 0) {
            age = a;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}