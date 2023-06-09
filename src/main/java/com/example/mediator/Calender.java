package com.example.mediator;

public class Calender extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("doCalender");
    }

    public void doCalender() {
        System.out.println("doCalender()");
    }
}
