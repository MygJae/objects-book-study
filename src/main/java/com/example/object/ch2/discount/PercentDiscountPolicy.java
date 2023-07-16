package com.example.object.ch2.discount;

import com.example.object.ch2.DefaultDiscountPolicy;
import com.example.object.ch2.DiscountCondition;
import com.example.object.ch2.Money;
import com.example.object.ch2.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
