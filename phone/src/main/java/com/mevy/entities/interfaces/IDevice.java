package com.mevy.entities.interfaces;

public interface IDevice {
    
    int percentBattery();
    void turnOn();
    void turnOff();
    void charge(int value);

}
