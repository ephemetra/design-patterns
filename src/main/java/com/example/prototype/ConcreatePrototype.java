package com.example.prototype;

public class ConcreatePrototype extends Prototype {

    private String filed;

    public ConcreatePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcreatePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
