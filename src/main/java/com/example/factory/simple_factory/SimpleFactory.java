package com.example.factory.simple_factory;

import com.example.factory.ConcreteProduct;
import com.example.factory.ConcreteProduct1;
import com.example.factory.ConcreteProduct2;
import com.example.factory.Product;

public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}