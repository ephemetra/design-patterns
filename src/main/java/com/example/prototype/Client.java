package com.example.prototype;

public class Client {

    public static void main(String[] args) {
        Prototype concreatePrototype = new ConcreatePrototype("abc");
        Prototype clone = concreatePrototype.myClone();
        System.out.println(clone);
    }
}
