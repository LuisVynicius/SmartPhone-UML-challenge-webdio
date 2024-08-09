package com.mevy.entities;

import java.util.Objects;

import com.mevy.entities.interfaces.IDeviceWithInternet;

public abstract class DeviceWithInternet extends Device implements IDeviceWithInternet {

    protected String wifi;

    public DeviceWithInternet(int maxBattery, int maxMemory) {
        super(maxBattery, maxMemory);
    }

    public boolean connect(String wifi) {
        this.wifi = wifi;
        return true;
    }

    public boolean desconect() {
        if (Objects.isNull(this.wifi)) {
            return false;
        }
        this.wifi = null;
        return true;
    }
    
}
