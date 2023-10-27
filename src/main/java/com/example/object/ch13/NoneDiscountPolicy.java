package com.example.object.ch13;

import com.example.object.ch13.DiscountPolicy;
import com.example.object.ch13.Screening;
import com.example.object.ch13.Money;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
