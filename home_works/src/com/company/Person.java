package com.company;

public class Person {
    String firstName;
    String lastName;
    String patronymic;
    int birthYear;
    String hobby;
    String gender;

    // - геттеры и сеттеры
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getHobby() {
        return hobby;
    }

    public String getGender() {
        return gender;
    }

    // - Конструкторы, для всех свойств
    public Person(String firstName, String lastName, String patronymic, int age, String hobby, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthYear = 2020 - age;
        this.hobby = hobby;
        this.gender = gender;
    }
    
    // - Конструкторы только для ФИО, года рождения и пола
    public Person(String firstName, String lastName, String patronymic, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthYear = 2020 - age;
        this.gender = gender;
    }
}
