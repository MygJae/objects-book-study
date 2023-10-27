package com.example.object.appendixA;

import java.util.List;

public class EmptyCallException extends RuntimeException{

    public interface RatePolicy {
        Money calculateFee(List<Call> calls) throws EmptyCallException;
    }

}
