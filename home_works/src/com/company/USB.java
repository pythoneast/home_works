package com.company;

public class USB {
    String USBType;
    int portID;

    public USB() {}

    public USB(String USBType, int portID) {
        this.USBType = USBType;
        this.portID = portID;
    }

    public void setUSBType(String USBType) {
        this.USBType = USBType;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    public String getUSBType() {
        return USBType;
    }

    public int getPortID() {
        return portID;
    }
}
