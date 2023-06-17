package com.example.singleton;

public class Singleton {

    private Singleton() {
    }

    public Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
