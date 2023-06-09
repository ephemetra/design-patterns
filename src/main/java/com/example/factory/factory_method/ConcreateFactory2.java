package com.example.factory.factory_method;

import com.example.factory.ConcreteProduct2;
import com.example.factory.Product;

public class ConcreateFactory2 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
