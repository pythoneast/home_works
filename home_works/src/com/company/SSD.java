package com.company;

public class SSD {
    double size;
    int partitionCount;

    public SSD() {}

    public SSD(double size, int partitionCount) {
        this.size = size;
        this.partitionCount = partitionCount;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPartitionCount(int partitionCount) {
        this.partitionCount = partitionCount;
    }

    public double getSize() {
        return size;
    }

    public int getPartitionCount() {
        return partitionCount;
    }
}
