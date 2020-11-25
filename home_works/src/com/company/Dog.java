package com.company;

public class Dog {
    String name;
    String breed;
    int age;

    public void setName(String n) {
        name = n;
    }

    public void setBreed(String b) {
        breed = b;
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

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}