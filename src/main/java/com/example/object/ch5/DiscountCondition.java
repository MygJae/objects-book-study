package com.example.object.ch5;

import com.example.object.ch5.DiscountConditionType;

import java.time.DayOfWeek;
import java.time.LocalTime;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
