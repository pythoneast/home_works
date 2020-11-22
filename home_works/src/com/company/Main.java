package com.company;

public class Main {
    public static void main(String[] args) {
	    // Задача A. Создание классов

        // Создать эскиз «Студент», придумать и добавить свойства.
        // Создать 3 объекта класса «Студент».
        // Заполнить студентов (Задать их свойства)
        // Отобразить данные студентов

        // Формат входных данных
        // Нет входных данных
        // Формат выходных данных
        // Данные студентов

        System.out.println();
        System.out.println("Задача A. Создание классов");
        System.out.println();


        Student stud1 = new Student();
        stud1.firstName = "Azamat";
        stud1.lastName = "Maratov";
        stud1.birthYear = 1999;
        stud1.gender = "male";

        System.out.println(stud1.firstName + " " + stud1.lastName + ", " + stud1.gender + ", " + stud1.birthYear);

        Student stud2 = new Student();
        stud2.firstName = "Aykyz";
        stud2.lastName = "Bolotova";
        stud2.birthYear = 2000;
        stud2.gender = "female";

        System.out.println(stud2.firstName + " " + stud2.lastName + ", " + stud2.gender + ", " + stud2.birthYear);

        Student stud3 = new Student();
        stud3.firstName = "Akmaral";
        stud3.lastName = "Aydarova";
        stud3.birthYear = 2003;
        stud3.gender = "female";

        System.out.println(stud3.firstName + " " + stud3.lastName + ", " + stud3.gender + ", " + stud3.birthYear);

        // Задача B. Создание классов самостоятельно

        //· Придумайте эскиз
        //· Придумайте свойства для эскиза
        //· Создайте несколько объектов вашего класса
        //· Заполните данные этих объектов
        //· Отобразите данные в консоли

        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Данные объектов

        System.out.println();
        System.out.println("Задача B. Создание классов самостоятельно");
        System.out.println();

        Country usa = new Country();

        usa.name = "United States of America";
        usa.capital = "Washington";
        usa.area = 9833517;
        usa.population = 328953020;

        System.out.println(usa.name + ", Capital: " + usa.capital + ", Area: " + usa.area + ", Population: " + usa.population);


        Country kazakhstan = new Country();

        kazakhstan.name = "Kazakhstan";
        kazakhstan.capital = "Astana";
        kazakhstan.area = 2725000;
        kazakhstan.population =  18865586;

        System.out.println(kazakhstan.name + ", Capital: " + kazakhstan.capital + ", Area: " + kazakhstan.area + ", Population: " + kazakhstan.population);

        Country kyrgyzstan = new Country();

        kyrgyzstan.name = "United States of America";
        kyrgyzstan.capital = "Washington";
        kyrgyzstan.area = 199900;
        kyrgyzstan.population = 6567079;

        System.out.println(kyrgyzstan.name + ", Capital: " + kyrgyzstan.capital + ", Area: " + kyrgyzstan.area + ", Population: " + kyrgyzstan.population);

        // Задача C. Ответьте на вопросы
        System.out.println();
        System.out.println("Задача C. Ответьте на вопросы");
        System.out.println();

        //Кратко, своими словами по 2 предложения:

        //· 1. Что такое парадигма ООП?

        // Термин парадигма означает совокупность идей и понятий, определяющих стиль написания компьютерных программ.
        // Что касается парадигмы ООП, то она заключается в представлении программы в виде совокупности объектов,
        // каждый из которых является экземпляром определённого класса.


        //· 2. Что такое классы в Java?

        // Класс - это универсальный, комплексный тип данных, состоящий из тематически единого набора свойств и методов,
        // то есть он является моделью информационной сущности с внутренним и внешним интерфейсами для оперирования своим содержимым.

        //· 3. Что такое свойства класса?

        // Свойства — это любые данные, которыми можно характеризовать объект класса.
        // В нашем случае с классом Ball, его свойствами могут быть его цвет, стоимость, страна производителя и тд.


        //– Напишите код для примеров ниже:

        //· 4. Как создать экземпляр класса (объект)?

        Student ali = new Student();

        //· 5. Как создать свойства для определенного класса?

        //  public class Student {
        //      String firstName;
        //      String lastName;
        //  }


        //· 6. Как задать свойства?

        ali.firstName = "Ali";
        ali.lastName = "Palitaev";
        ali.birthYear = 1994;
        ali.gender = "male";

        //· 7. Как получить определенное свойства объекта?

        System.out.println("Student: " + ali.firstName + " " + ali.lastName + ", " + ali.gender + ", " + ali.birthYear);
    }
}
