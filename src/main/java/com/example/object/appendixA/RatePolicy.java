package com.example.object.appendixA;

import com.example.object.appendixA.Money;

import java.util.List;

public interface RatePolicy {
	Money calculateFee(List<Call> calls);
}
