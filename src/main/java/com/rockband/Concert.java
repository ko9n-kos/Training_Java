package com.rockband;

import java.util.Arrays;
import java.util.List;

public class Concert {
    public static void main(String[] args) {


        Play drummer = new Drums();
        Play guitarist1 = new Solo();
        Play guitarist2 = new Bass();
        Play guitarist3 = new Rhythm();

//        drummer.setInstrument("Drums");
//        guitarist1.setInstrument("Bass");
//        guitarist2.setInstrument("Guitar");
//        guitarist3.setInstrument("Guitar");

        Play.setInstrument("Drums");

        List<Play> rock = Arrays.asList(drummer, guitarist1, guitarist2, guitarist3);
        for(Play r: rock){
            r.playOnIt();
        }






    }
}
