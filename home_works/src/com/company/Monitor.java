package com.company;

public class Monitor {
    double size;
    String producer;
    String type;

    public Monitor() {}

    public Monitor(double size, String producer, String type) {
        this.size = size;
        this.producer = producer;
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }
}
