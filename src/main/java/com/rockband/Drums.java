package com.rockband;

import java.util.Arrays;
import java.util.List;

public class Drums extends Play {

    @Override
    public void playOnIt() {
        instruments = Arrays.asList("Drums");
        setRole("Drummer");
        if (instruments.contains(instrument)){
            System.out.println("I can play a great drum solo on this " + instrument);
        }else
            printReject();

    }
}
