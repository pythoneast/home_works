package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задача A.

        // Создать класс Человек Свойства:
        // - имя
        // - фамилия
        // - отчество
        // - год рождения
        // - хобби
        // - пол
        // Нужно создать:
        // - геттеры и сеттеры
        // - Конструкторы, для всех свойств
        // - Конструкторы только для ФИО, года рождения и пола
        // Нужно рассказать о себе, при этом нужно говорить свой возраст, а не год рождения.
        // Создать массив из 10 человек и вывести на экран информацию (каждый рассказывает о себе).
        // Если хобби не заполнено, то не нужно выводить это свойство, чтобы хобби не было: null

        System.out.println();
        System.out.println("Задача A.");
        System.out.println();

        Random random = new Random();
        Person[] personList = new Person[10];

        personList[0] = new Person("Ali Mukhamed", "Palitaev", "Yarmukhamed", random.nextInt(77), "running", "male");
        personList[1] = new Person("Samat", "Musaev", "Bolot", random.nextInt(77), "swimming", "male");
        personList[2] = new Person("Anna", "Borodina", "Valeryevna", random.nextInt(77), "walking", "female");
        personList[3] = new Person("Dair", "Asanov", "Dodoevich", random.nextInt(77), "reading", "male");
        personList[4] = new Person("Nurseit", "Nurseitov", "Nurseitovich", random.nextInt(77), "flying", "male");
        personList[5] = new Person("Begayim", "Akylova", "Kayratovna", random.nextInt(77), "fishin", "male");
        personList[6] = new Person("Sergei", "Klevakin", "Aleksandrovich", random.nextInt(77), "chilling", "male");
        personList[7] = new Person("Bektur", "Soltobaev", "Damirovich", random.nextInt(77), "travelling", "male");
        personList[8] = new Person("Maksim", "Poletaev", "Vadimovich", random.nextInt(77), "drawing", "male");
        personList[9] = new Person("Ashley", "Simpson", "John", random.nextInt(77), "cooking", "female");

        for (int i = 0; i < personList.length; i++) {
            
            String intro = "My name is: " + personList[i].getFirstName() + " " + personList[i].getLastName() +
                " " + personList[i].getPatronymic() + " " + personList[i].getBirthYear() + " " + personList[i].getGender();
            if (personList[i].getHobby() == null) {
                intro = intro + " " + personList[i].getHobby();
            }

            System.out.println(intro);
        }

        



        // Задача B. Ответьте на вопросы
        
        System.out.println();
        System.out.println("Задача B.");
        System.out.println();

        // Кратко, своими словами по 2 предложения:

        // 1. Что такое конструктор?

        System.out.println("1. Что такое конструктор?");
        System.out.println();
        System.out.println("Конструктор - это что-то вроде метода, вызываемого в момент создания нового экземпляра класса. Он создает новый объект класса либо с параметрами, либо без.");
        System.out.println();
        System.out.println();


        // 2. Что такое дефолтный конструктор (по умолчанию)?
        
        System.out.println("2. Что такое дефолтный конструктор (по умолчанию)?");
        System.out.println();
        System.out.println("Дефолтный конструктор создается если не объявить свой конструктор. Он не принимает никаких параметров и создает пустой объект класса.");
        System.out.println();
        System.out.println();

        // 3. Как работает конструктор?

        System.out.println("3. Как работает конструктор?");
        System.out.println();
        System.out.println("Он вызывается при создании объекта, если же он получает параметры, то заполняет эти свойства объекта.");
        System.out.println();
        System.out.println();

        // 4. Для чего нужен конструктор?

        System.out.println("4. Для чего нужен конструктор?");
        System.out.println();
        System.out.println("Конструктор необходим для создания объекта и заполнения его начальными значениями.");
        System.out.println();
        System.out.println();

        // 5. Какой конструктор вызывается когда конструкторов несколько?

        System.out.println("5. Какой конструктор вызывается когда конструкторов несколько?");
        System.out.println();
        System.out.println("Если конструкторов несколько, то вызывается тот, который подходит под переданные параметры. Так если ничего не передать вызовется дефолтный конструктор.");
        System.out.println();
        System.out.println();

        // 6. Что такое this?

        System.out.println("6. Что такое this?");
        System.out.println();
        System.out.println("This - это ссылка на объект. Она позволяет избежать конфликта в случае, если названия переменных схожи с названиями свойств класса.");
        System.out.println();
        System.out.println();


        // Задача С. Периферия вашего компьютера
        // Создайте классы для следующих объектов:
        // Компьютер
        // · Дисплей
        // · Марка
        // · Цвет
        // · Жесткий диск/или SSD
        // · Оперативная память
        // · Видео карта
        // · USB порты(Массив из портов)
        // · Клавиатура
        // Дисплей
        // · Диагональ
        // · Производитель
        // · Тип матрицы
        // Жесткий диск/SSD
        // · Объем памяти
        // · На сколько дисков разделен
        // Оперативная память
        // · Объем
        // · Производитель
        // USB порт
        // · Тип порта(2.0 или 3.0)
        // · id порта
        // Клавиатура
        // · Массив раскладок клавиатуры(Нужен ли тут объект решать вам)
        // · Наличие подсветки
        // · Наличие дополнительных цифр справа
        // Создайте конструкторы для всех классов (всех свойств), а также добавьте конструктор по умолчанию.
        // Создайте один объект компьютера, который опишет ваш компьютер.
        // Выведите информацию о нем в консоль.
        // Использовать Конструкторы для создания объектов.
        // Использовать геттеры и сеттеры для получения и присваивания значений

        System.out.println();
        System.out.println("Задача С. Периферия вашего компьютера");
        System.out.println();

        GPU gpu = new GPU(8, "Asus");
        
        char[] keys = new char[] {
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', 'a', 's',
        };
        Keyboard keyboard = new Keyboard(keys, true, true);

        Monitor monitor = new Monitor(24.0, "Philips", "IPS");

        RAM ram = new RAM(16.0, "Azrock");

        SSD ssd = new SSD(500, 5);

        USB usbPort1 = new USB("2.0", 1);
        USB usbPort2 = new USB("2.0", 2);
        USB usbPort3 = new USB("2.0", 3);
        USB usbPort4 = new USB("2.0", 4);
        USB usbPort5 = new USB("3.0", 5);
        USB usbPort6 = new USB("3.0", 6);

        USB[] usbPorts = {
            usbPort1, usbPort2, usbPort3,
            usbPort4, usbPort5, usbPort6,
        };

        Computer computer = new Computer(monitor, "Asus", "Black", ssd, ram, gpu, usbPorts, keyboard);

        System.out.println("Computer");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Color: " + computer.getColor());

        Monitor cMonitor = computer.getMonitor();
        System.out.println("Monitor: " + cMonitor.getProducer() + " " + cMonitor.getSize() + " " + cMonitor.getType());

        SSD cSSD = computer.getSSD();
        System.out.println("SSD: " + cSSD.getSize() + " " + cSSD.getPartitionCount());

        RAM cRAM = computer.getRAM();
        System.out.println("RAM: " + cRAM.getSize() + " " + cRAM.getProducer());

        GPU cGPU = computer.getGPU();
        System.out.println("GPU: " + cGPU.getSize() + " " + cGPU.getProducer());

        USB[] cUSBPorts = computer.getUSBPorts();
        System.out.println(cUSBPorts.length + " USB ports: ");

        for (int i = 0; i < cUSBPorts.length; i++) {
            System.out.println((i+1) + ") " + cUSBPorts[i].getUSBType() + " " + cUSBPorts[i].getPortID());
        }

        Keyboard cKeyboard = computer.getKeyboard();
        char[] cKeys = cKeyboard.getKeys();
        System.out.println("Keyboard: ");

        System.out.println("Has backlight: " + cKeyboard.getHasBacklight() + ". Has numpad: " + cKeyboard.getHasNumPad());
        for (int i = 0; i < cKeys.length; i++) {
            System.out.print(cKeys[i] + " ");
        }
        System.out.println();
    }
}
