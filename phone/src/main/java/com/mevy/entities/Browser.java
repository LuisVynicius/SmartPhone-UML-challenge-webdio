package com.mevy.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Browser extends App {

    private String url;
    private List<String> favorites;
    
    public Browser() {
        this.favorites = new ArrayList<>();
    }

    public void search(String url) {
        this.url = url;
    }

    public boolean favorite() {
        if (Objects.isNull(url)) {
            return false;
        }
        this.favorites.add(url);
        return true;
    }

    public boolean removeFavorite(String favorite) {
        if (!urlInFavorite(favorite)) {
            return false;
        }
        this.favorites.remove(favorite);
        return true;
    }

    private boolean urlInFavorite(String favorite) {
        return this.favorites.contains(favorite);
    }
    
}
