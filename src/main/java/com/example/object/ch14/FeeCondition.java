package com.example.object.ch14;

import com.example.object.ch14.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
