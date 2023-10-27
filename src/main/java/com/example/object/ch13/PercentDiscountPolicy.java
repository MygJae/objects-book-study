package com.example.object.ch13;

import com.example.object.ch13.DiscountCondition;
import com.example.object.ch13.DiscountPolicy;
import com.example.object.ch13.Screening;
import com.example.object.ch13.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
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
