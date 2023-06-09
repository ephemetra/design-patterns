package com.example.factory.factory_method;

import com.example.factory.ConcreteProduct1;
import com.example.factory.Product;

public class ConcreateFactory1 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
