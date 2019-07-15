package com.springinaction.agr.performers;

import com.springinaction.agr.instruments.Instrument;
import com.springinaction.agr.performers.PerformanceException;
import com.springinaction.agr.performers.Performer;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
