package com.company;

public class Fish {
    String name;
    String color;
    int age;

    public void setName(String n) {
        name = n;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setAge(int a) {
        if (a >= 0) {
            age = a;
        } else {
            System.out.println("Age value must be positive!");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}