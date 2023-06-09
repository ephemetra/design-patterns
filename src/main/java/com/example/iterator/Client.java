package com.example.iterator;

public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreateAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
