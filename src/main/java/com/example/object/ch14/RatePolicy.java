package com.example.object.ch14;

import com.example.object.ch14.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
