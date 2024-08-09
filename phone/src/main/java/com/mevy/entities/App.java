package com.mevy.entities;

import java.util.Map;
import java.util.Scanner;

import com.mevy.entities.interfaces.IApp;

public abstract class App implements IApp {
    
    protected int memory;
    protected Map<String, Boolean> permissions;

    @Override
    public void init() {
        System.out.println("Opening...");
    }

    @Override
    public void close() {
        System.out.println("Closing...");
    }

    @Override
    public void getPermissions() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Allow(true) or Deny(false)");
            for (Map.Entry<String, Boolean> permission : permissions.entrySet()) {
                System.out.print(permission.getKey() + ": ");
                permission.setValue(scanner.nextBoolean());
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

}
