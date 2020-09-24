package com.rockband;

import java.util.Arrays;

public class Rhythm extends Play{
    public void playOnIt() {
        instruments = Arrays.asList("Guitar", "Bass");
        setRole("Rhythm guitarist");
        if (instruments.contains(instrument)){
            System.out.println("I can play a great rhythm part on this " + instrument);
        }else
            printReject();

    }
}
