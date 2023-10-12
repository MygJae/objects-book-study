package com.example.object.ch11;

import com.example.object.ch11.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
