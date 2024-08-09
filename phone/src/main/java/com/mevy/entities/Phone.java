package com.mevy.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phone extends App {
    
    private List<String> favorites;
    private List<String> contacts;
    private String calling;

    public Phone() {
        this.favorites = new ArrayList<>();
    }

    public boolean call(String contact) {
        this.hangUp();
        if (!contacts.contains(contact)) {
            return false;
        }
        this.calling = contact;
        return true;
    }

    public boolean hangUp() {
        if (Objects.isNull(calling)) {
            return false;
        }
        this.calling = null;
        return true;
    }

    public boolean addContact(String contact) {
        if (contactExist(contact)) {
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    public boolean removeContact(String contact) {
        if (!contactExist(contact)) {
            return false;
        }
        this.contacts.remove(contact);
        return true;
    }

    public boolean addFavorite(String contact) {
        if (!contactExist(contact)) {
            return false;
        }
        this.favorites.add(contact);
        return true;
    }

    public boolean removeFavorite(String contact) {
        if (!contactInFavorite(contact)) {
            return false;
        }
        this.favorites.remove(contact);
        return true;
    }

    private boolean contactExist(String contact) {
        return this.contacts.contains(contact);
    }

    private boolean contactInFavorite(String contact) {
        return this.favorites.contains(contact);
    }

}
