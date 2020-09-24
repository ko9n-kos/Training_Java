package com.rockband;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Play {

    static String instrument;

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        Play.role = role;
    }

    static String role;

    public static String getInstrument() {
        return instrument;
    }

    public static void setInstrument(String instrument) {
        Play.instrument = instrument;
    }

    public List<String> instruments;



    public abstract void playOnIt();

    public void printReject (){
        System.out.println("I can't play on it, I am " + getRole());
    }

}
