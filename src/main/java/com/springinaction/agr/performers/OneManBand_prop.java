package com.springinaction.agr.performers;

public class OneManBand_prop implements Performer {
    public OneManBand_prop() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.stringPropertyNames()) {
            System.out.print(key + " : ");
            System.out.println(instruments.get(key));
        }
    }

    private java.util.Properties instruments;

    public void setInstruments(java.util.Properties  instruments) {
        this.instruments = instruments;
    }
}
