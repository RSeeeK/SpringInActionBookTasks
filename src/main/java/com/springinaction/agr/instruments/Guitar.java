package com.springinaction.agr.instruments;

public class Guitar implements Instrument{
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("BRIN BRIN BRIN");
    }

}
