package com.example.command;

/**
 * 遥控器
 */
public class Invoker {

    private final int slotNum = 7;
    private Command[] onCommands;
    private Command[] offCommands;

    public Invoker() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];
    }

    public void setOnCommand(Command command, int slot) {
        onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot) {
        offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
