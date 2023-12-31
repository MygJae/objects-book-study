package com.example.object.appendixB;

import com.example.object.appendixB.Money;

import java.util.List;

public interface DiscountPolicy {
    default Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : getConditions()) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return screening.getMovieFee();
    }

    List<DiscountCondition> getConditions();
    Money getDiscountAmount(Screening screening);
}
