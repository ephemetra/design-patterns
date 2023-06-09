package com.example.singleton;

public class Singleton {

    private Singleton() {
    }

    private static final class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
