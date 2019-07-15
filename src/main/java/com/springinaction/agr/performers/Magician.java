package com.springinaction.agr.performers;

import com.springinaction.agr.instruments.MagicBox;

public class Magician implements Performer {
    public Magician() {
    }


    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("Themagic bpx contains...");
        System.out.println(magicBox.getContents());
    }

    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
