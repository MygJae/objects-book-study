package com.example.object.ch2.discount;

import com.example.object.ch2.DiscountPolicy;
import com.example.object.ch2.Money;
import com.example.object.ch2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
