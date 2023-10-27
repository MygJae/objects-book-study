package com.example.object.ch13;

import com.example.object.ch13.DiscountCondition;
import com.example.object.ch13.DiscountPolicy;
import com.example.object.ch13.Screening;
import com.example.object.ch13.Money;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
