package com.springinaction.agr.instruments;

public class Harmonica implements Instrument {

    public Harmonica() {
    }

    @Override
    public void play() {
        System.out.println("PRIAM PRIAM PRIAM");
    }
}
