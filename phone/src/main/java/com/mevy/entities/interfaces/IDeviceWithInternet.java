package com.mevy.entities.interfaces;

public interface IDeviceWithInternet extends IDevice {

    boolean connect(String wifi);
    boolean desconect();

}
