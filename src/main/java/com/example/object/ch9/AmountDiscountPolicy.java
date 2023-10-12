package com.example.object.ch9;

import com.example.object.ch9.Money;
import com.example.object.ch9.DiscountCondition;
import com.example.object.ch9.DiscountPolicy;
import com.example.object.ch9.Screening;

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
