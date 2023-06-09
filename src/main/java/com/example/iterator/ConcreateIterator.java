package com.example.iterator;

public class ConcreateIterator<Item> implements Iterator<Item> {

    private Item[] items;
    private int position = 0;

    public ConcreateIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Item next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
