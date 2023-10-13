package com.example.object.ch13;

import org.eternity.movie.step02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
