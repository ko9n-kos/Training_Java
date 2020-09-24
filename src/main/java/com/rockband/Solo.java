package com.rockband;

import java.util.Arrays;

public class Solo extends Play {
    public void playOnIt() {
        instruments = Arrays.asList("Guitar", "Bass");
        setRole("Solo guitarist");
        if (instruments.contains(instrument)){
            System.out.println("I can play a great solo on this " + instrument);
        }else
            printReject();

    }
}
