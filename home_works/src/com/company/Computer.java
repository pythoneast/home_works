package com.company;

public class Computer {
    Monitor monitor;
    String brand;
    String color;
    SSD ssd;
    RAM ram;
    GPU gpu;
    USB[] usbPorts;
    Keyboard keyboard;

    public Computer() {}

    public Computer(Monitor monitor, String brand, String color, SSD ssd, RAM ram, GPU gpu, USB[] usbPorts, Keyboard keyboard) {
        this.monitor = monitor;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.gpu = gpu;
        this.usbPorts = usbPorts;
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public SSD getSSD() {
        return ssd;
    }

    public RAM getRAM() {
        return ram;
    }

    public GPU getGPU() {
        return gpu;
    }

    public USB[] getUSBPorts() {
        return usbPorts;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
