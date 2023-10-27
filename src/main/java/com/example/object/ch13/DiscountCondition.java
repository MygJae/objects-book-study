package com.example.object.ch13;

import com.example.object.ch13.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
