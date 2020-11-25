package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        // Задача A.Домашние питомцы

        // Создайте классы для следующих домашних животных
        //
        //· Попугай
        //
        //· Собака
        //
        //· Кошка
        //
        //· Рыбки
        //
        //  Создайте нужные свойства для каждого из классов.
        //  Создайте по несколько экземпляров каждого из домашних животным. Задайте им все созданные свойства.
        //  Выведите информацию о питомцах в консоль
        //  Использовать геттеры и сеттеры для получения и присваивания значений
        //  Проверить Возраст на негативное значение

        System.out.println();
        System.out.println("Задача A. Домашние питомцы");
        System.out.println();
        System.out.println("Parrots");
        System.out.println();

        Parrot parrot1 = new Parrot();
        parrot1.setName("Johny");
        parrot1.setColor("Green");
        parrot1.setAge(3);
        System.out.println(parrot1.getName() + ", " + parrot1.getColor() + ", " + parrot1.getAge());

        Parrot parrot2 = new Parrot();
        parrot2.setName("Jack");
        parrot2.setColor("Yellow");
        parrot2.setAge(5);
        System.out.println(parrot2.getName() + ", " + parrot2.getColor() + ", " + parrot2.getAge());

        Parrot parrot3 = new Parrot();
        parrot3.setName("Michael");
        parrot3.setColor("Black");
        parrot3.setAge(-1);
        System.out.println(parrot3.getName() + ", " + parrot3.getColor() + ", " + parrot3.getAge());

        System.out.println();
        System.out.println("Dogs");
        System.out.println();

        Dog dog1 = new Dog();
        dog1.setName("Bobby");
        dog1.setBreed("Bulldog");
        dog1.setAge(-10);
        System.out.println(dog1.getName() + ", " + dog1.getBreed() + ", " + dog1.getAge());

        Dog dog2 = new Dog();
        dog2.setName("Rex");
        dog2.setBreed("German Shepherd");
        dog2.setAge(1);
        System.out.println(dog2.getName() + ", " + dog2.getBreed() + ", " + dog2.getAge());

        Dog dog3 = new Dog();
        dog3.setName("Hachiko");
        dog3.setBreed("Akita");
        dog3.setAge(5);
        System.out.println(dog3.getName() + ", " + dog3.getBreed() + ", " + dog3.getAge());

        System.out.println();
        System.out.println("Cats");
        System.out.println();

        Cat cat1 = new Cat();
        cat1.setName("Mao");
        cat1.setWeight(-1);
        cat1.setAge(-2);
        System.out.println(cat1.getName() + ", " + cat1.getWeight() + ", " + cat1.getAge());

        Cat cat2 = new Cat();
        cat2.setName("Sam");
        cat2.setWeight(4.5);
        cat2.setAge(10);
        System.out.println(cat2.getName() + ", " + cat2.getWeight() + ", " + cat2.getAge());

        Cat cat3 = new Cat();
        cat3.setName("Nani");
        cat3.setWeight(2);
        cat3.setAge(7);
        System.out.println(cat3.getName() + ", " + cat3.getWeight() + ", " + cat3.getAge());

        System.out.println();
        System.out.println("Fishes");
        System.out.println();

        Fish fish1 = new Fish();
        fish1.setName("Mark");
        fish1.setColor("Black");
        fish1.setAge(-1);
        System.out.println(fish1.getName() + ", " + fish1.getColor() + ", " + fish1.getAge());

        Fish fish2 = new Fish();
        fish2.setName("Mary");
        fish2.setColor("Blue");
        fish2.setAge(4);
        System.out.println(fish2.getName() + ", " + fish2.getColor() + ", " + fish2.getAge());

        Fish fish3 = new Fish();
        fish3.setName("Luna");
        fish3.setColor("Pink");
        fish3.setAge(8);
        System.out.println(fish3.getName() + ", " + fish3.getColor() + ", " + fish3.getAge());

        //  Задача B.Создание классов

        //  Создать новый класс – Курс, со следующими свойствами:
        //
        //· Наименование
        //
        //· Дата создания
        //
        //· ID
        //
        //· ФИО преподавателя
        //
        //  Создать класс – Студент, со следующими свойствами:
        //
        //· Дата рождения
        //
        //· Фамилия
        //
        //· Имя
        //
        //· Пол
        //
        //· Возраст
        //
        //  Создать класс – Группа, со следующими свойствами:
        //
        //· Массив объектов «Студента»
        //
        //· «Курс»
        //
        //· Дата начала
        //
        //· Длительность в месяцах
        //
        //  Создайте конструкторы для обоих классов (всех свойств), а также добавьте конструктор по умолчанию.
        //  Использовать геттеры и сеттеры для получения и присваивания значений
        //  Проверить Возраст на негативное значение

        System.out.println();
        System.out.println("Задача B.Создание классов");
        System.out.println();
        
        Course course = new Course("Mobile Development", getDateFromString("01/01/2021"), 1, "Mark Zukkerberg");
        course.setName("Mob Dev");
        course.setDateOfCreation(getDateFromString("05/05/2020"));
        course.setID(10);
        course.setTeacherFullName("Ali Palitaev");

        System.out.println();
        System.out.println("Курс:");
        System.out.println();

        System.out.println(course.getName() + " " + course.getDateOfCreation() + " " + course.getID() + " " + course.getTeacherFullName());

        Student student1 = new Student(getDateFromString("07/07/2000"), "Musk", "Elon", "male", 20);
        Student student2 = new Student(getDateFromString("01/01/1999"), "Van Rossum", "Guido", "male", 21); 
        Student student3 = new Student(getDateFromString("05/05/2001"), "Durov", "Pavel", "male", 19);

        student1.setBirthDate(getDateFromString("07/07/2002"));
        student1.setLastName("Маск");
        student1.setFirstName("Илон");
        student1.setGender("муж");
        student1.setAge(18);

        System.out.println();
        System.out.println("Студент");
        System.out.println();

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getGender() + " " + student1.getBirthDate() + " " + student1.getAge());

        Student[] students = {student1, student2, student3};
    
        Group group = new Group(students, course, getDateFromString("01/02/2021"), 10);
        group.setStudents(students);
        group.setCourse(course);
        group.setStartDate(getDateFromString("01/02/2021"));
        group.setDurationInMonths(12);

        System.out.println();
        System.out.println("Группа:");
        System.out.println();
        System.out.println(group.getStudents() + " " + group.getCourse() + ", Start Date" + group.getStartDate() + ", Duration: " + group.getDurationInMonths() + " months.");
        System.out.println();
    }

    public static Date getDateFromString(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date date = formatter.parse(dateString);
            return date;
        } catch (ParseException e) {
            Date today = new Date();
            return today;
        }
    }
}
