package com.example.factory.factory_method;

import com.example.factory.ConcreteProduct;
import com.example.factory.Product;

public class ConcreateFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
