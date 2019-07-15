package com.springinaction.agr.instruments;

public class Piano implements Instrument {
    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLANK PLANK PLANK");
    }
}
