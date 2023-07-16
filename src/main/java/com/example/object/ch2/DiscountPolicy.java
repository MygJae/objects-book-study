package com.example.object.ch2;

import com.example.object.ch2.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
