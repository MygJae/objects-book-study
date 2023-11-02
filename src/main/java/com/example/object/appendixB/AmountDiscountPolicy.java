package com.example.object.appendixB;

import com.example.object.appendixB.DiscountCondition;
import com.example.object.appendixB.DiscountPolicy;
import com.example.object.appendixB.Screening;
import com.example.object.appendixB.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmountDiscountPolicy implements DiscountPolicy {
    private Money discountAmount;
    private List<DiscountCondition> conditions = new ArrayList<>();

    public AmountDiscountPolicy(Money discountAmount,
                                DiscountCondition... conditions) {
        this.discountAmount = discountAmount;
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public List<DiscountCondition> getConditions() {
        return conditions;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
