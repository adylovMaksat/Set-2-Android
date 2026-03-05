package com.example.lab1mobilesystems;

public class Bulb {

    private boolean isOn;
    private boolean isBurned;

    public Bulb() {
        isOn = false;
        isBurned = false;
    }

    public void turnOn() {
        if (isBurned) {
            return;
        }
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isBurned() {
        return isBurned;
    }

    public void burn() {
        isBurned = true;
        isOn = false;
    }
}