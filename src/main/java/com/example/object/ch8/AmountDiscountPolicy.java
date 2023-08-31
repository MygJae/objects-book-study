package com.example.object.ch8;

import com.example.object.ch8.Money;
import com.example.object.ch8.DiscountCondition;
import com.example.object.ch8.DiscountPolicy;
import com.example.object.ch8.Screening;

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
