package com.example.object.appendixA;

public class BookStall {
    public Book sell(IndependentPublisher independentPublisher) {
        return new Book(independentPublisher);
    }
}
