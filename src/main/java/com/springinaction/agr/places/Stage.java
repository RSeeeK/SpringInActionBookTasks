package com.springinaction.agr;

public class Stage {
    private Stage(){
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    private static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
