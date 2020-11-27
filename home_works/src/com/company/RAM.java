package com.company;

public class RAM {
    double size;
    String producer;

    public RAM() {}

    public RAM(double size, String producer) {
        this.size = size;
        this.producer = producer;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getSize() {
        return size;
    }

    public String getProducer() {
        return producer;
    }
}
