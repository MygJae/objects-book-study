package com.example.object.ch11;

import com.example.object.ch11.Call;
import com.example.object.ch11.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    protected Phone() {
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

    protected abstract Money calculateCallFee(Call call);
}
