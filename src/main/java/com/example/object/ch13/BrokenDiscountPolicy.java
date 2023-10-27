package com.example.object.ch13;

import com.example.object.ch13.DiscountCondition;
import com.example.object.ch13.DiscountPolicy;
import com.example.object.ch13.Screening;
import com.example.object.ch13.Money;

import java.time.LocalTime;

public class BrokenDiscountPolicy extends DiscountPolicy {

    public BrokenDiscountPolicy(DiscountCondition... conditions) {
        super(conditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        checkPrecondition(screening);                 // 기존의 사전조건
        checkStrongerPrecondition(screening);         // 더 강력한 사전조건

        Money amount = screening.getMovieFee();
        checkPostcondition(amount);                   // 기존의 사후조건
        checkStrongerPostcondition(amount);           // 더 강력한 사후조건
        return amount;
    }

    private void checkStrongerPrecondition(Screening screening) {
        assert screening.getEndTime().toLocalTime()
                .isBefore(LocalTime.MIDNIGHT);
    }

    private void checkStrongerPostcondition(Money amount) {
        assert amount.isGreaterThanOrEqual(Money.wons(1000));
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}

