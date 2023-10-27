package com.example.object.appendixA;

public class MagazineStore extends BookStall {
    @Override
    public Magazine sell(IndependentPublisher independentPublisher) {
        return new Magazine(independentPublisher);
    }
}
