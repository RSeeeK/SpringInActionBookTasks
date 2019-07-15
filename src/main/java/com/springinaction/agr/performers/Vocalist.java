package com.springinaction.agr.performers;

public class Vocalist implements Performer {

    public Vocalist() {
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("La la la");
    }
}
