package com.example.object.ch8;

import com.example.object.ch8.Money;
import com.example.object.ch8.DiscountPolicy;
import com.example.object.ch8.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
