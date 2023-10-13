package com.example.object.ch13;

import org.eternity.movie.step02.DiscountCondition;
import org.eternity.movie.step02.DiscountPolicy;
import org.eternity.movie.step02.Screening;
import org.eternity.money.Money;

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