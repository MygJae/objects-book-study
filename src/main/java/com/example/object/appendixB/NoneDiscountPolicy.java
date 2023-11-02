package com.example.object.appendixB;

import com.example.object.appendixB.DiscountCondition;
import com.example.object.appendixB.DiscountPolicy;
import com.example.object.appendixB.Screening;
import com.example.object.appendixB.Money;

import java.util.List;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee();
    }

    @Override
    public List<DiscountCondition> getConditions() {
        return null;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
