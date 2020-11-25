package com.company;
import java.util.Date;

public class Student {
    Date birthDate;
    String lastName;
    String firstName;
    String gender;
    int age;

    public Student() {}

    public Student(Date birthDate, String lastName, String firstName, String gender, int age) {
        this.birthDate = birthDate;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age value can't be negative");
        } else {
            this.age = age;
        }
    }

    public Date getbirthDate() {
        return birthDate;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
