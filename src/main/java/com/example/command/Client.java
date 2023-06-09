package com.example.command;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        invoker.setOnCommand(new LightOnCommand(light), 0);
        invoker.setOffCommand(new LightOffCommand(light), 0);

        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
