package com.example.object.ch13;

import com.example.object.ch13.DiscountCondition;
import com.example.object.ch13.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
