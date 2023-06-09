package com.example.mediator;

public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("doSprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
