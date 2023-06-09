package com.example.factory.factory_method;

import com.example.factory.Product;

public abstract class Factory {

    public void doSomething() {
        Product product = factoryMethod();
    }

    public abstract Product factoryMethod();
}
