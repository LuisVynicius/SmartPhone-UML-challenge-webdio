package com.mevy.entities;

import java.util.ArrayList;
import java.util.List;

import com.mevy.entities.interfaces.IDevice;

import lombok.Getter;

@Getter
public abstract class Device implements IDevice {
   
    protected int maxBattery;
    protected int currentBattery;
    protected int maxMemory;
    protected int currentMemory;
    protected List<App> apps;

    public Device(int maxBattery, int maxMemory) {
        this.maxBattery = maxBattery;
        this.currentBattery = 0;
        this.maxMemory = maxMemory;
        this.maxMemory = 0;
        this.apps = new ArrayList<>();
    }

    @Override
    public int percentBattery() {
        return this.currentBattery / this.maxBattery;
    }
    
    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }

    @Override
    public void charge(int value) {
        this.currentBattery += value;
    }

    public void addApp(App app) {
        this.apps.add(app);
    }

    public boolean removeApp(App app) {
        if (!appExist(app)) {
            return false;
        }
        this.apps.remove(app);
        return true;
    }

    private boolean appExist(App app) {
        return this.apps.contains(app);
    }
    
}
