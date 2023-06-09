package com.example.iterator;

public class ConcreateAggregate implements Aggregate {

    private Integer[] items;

    public ConcreateAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreateIterator(items);
    }
}
