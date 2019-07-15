package com.springinaction.agr.instruments;

public class Cymbal implements Instrument{
    public Cymbal() {
    }

    @Override
    public void play() {
        System.out.println("TISH TISH TISH");
    }
}
