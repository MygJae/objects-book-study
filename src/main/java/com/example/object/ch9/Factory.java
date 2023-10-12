package com.example.object.ch9;

import com.example.object.ch9.Money;
import com.example.object.ch9.Movie;
import com.example.object.ch9.AmountDiscountPolicy;
import com.example.object.ch9.SequenceCondition;

import java.time.Duration;

public class Factory {
    public Movie createAvatarMovie() {
        return new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000));
    }
}
