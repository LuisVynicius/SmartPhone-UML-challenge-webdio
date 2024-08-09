package com.mevy.entities;

import java.util.ArrayList;
import java.util.List;

public class PlayMusic extends App {
    
    private List<String> musics;

    public PlayMusic() {
        this.musics = new ArrayList<>();
    }

    public void printMusics() {
        System.out.println("==Musics==");
        musics.forEach(System.out::println);
        System.out.println("==========");
    }

    public boolean play(String music) {
        if (!musics.contains(music)) {
            return false;
        }
        System.out.println("Playing " + music);
        return true;
    }

}
