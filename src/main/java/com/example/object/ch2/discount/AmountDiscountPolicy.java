package com.example.object.ch2.discount;

import com.example.object.ch2.DefaultDiscountPolicy;
import com.example.object.ch2.DiscountCondition;
import com.example.object.ch2.Money;
import com.example.object.ch2.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
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
