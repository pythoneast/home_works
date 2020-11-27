package com.company;

public class GPU {
    double size;
    String producer;

    public GPU() {}

    public GPU(double size, String producer) {
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
