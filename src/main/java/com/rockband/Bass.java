package com.rockband;

import java.util.Arrays;

public class Bass extends Play {

    public void playOnIt() {
        instruments = Arrays.asList("Bass", "Guitar");
        setRole("Bass guitarist");
        if (instruments.contains(instrument)) {
            System.out.println("I can play a great bass part on this " + instrument);
        } else
            printReject();

    }
}
