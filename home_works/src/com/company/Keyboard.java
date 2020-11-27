package com.company;

public class Keyboard {
    char[] keys;
    boolean hasBacklight;
    boolean hasNumPad;

    public Keyboard() {}

    public Keyboard(char[] keys, boolean hasBacklight, boolean hasNumPad) {
        this.keys = keys;
        this.hasBacklight = hasBacklight;
        this.hasNumPad = hasNumPad;
    }

    public void setKeys(char[] keys) {
        this.keys = keys;
    }

    public void setHasBacklight(boolean hasBacklight) {
        this.hasBacklight = hasBacklight;
    }

    public void setHasNumPad(boolean hasNumPad) {
        this.hasNumPad = hasNumPad;
    }

    public char[] getKeys() {
        return keys;
    }

    public boolean getHasBacklight() {
        return hasBacklight;
    }

    public boolean getHasNumPad() {
        return hasNumPad;
    }
}
