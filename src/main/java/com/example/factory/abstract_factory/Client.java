package com.example.factory.abstract_factory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory concreateFactory1 = new ConcreateFactory1();
        AbstractProductA productA = concreateFactory1.createProductA();
        AbstractProductB productB = concreateFactory1.createProductB();
    }
}
