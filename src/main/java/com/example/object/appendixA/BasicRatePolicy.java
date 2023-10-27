package com.example.object.appendixA;

import com.example.object.appendixA.Money;

import java.util.List;

public abstract class BasicRatePolicy implements RatePolicy {
	@Override
	public Money calculateFee(List<Call> calls) {
		if (calls == null || calls.isEmpty()) {
			throw new EmptyCallException ();
		}
			// 사전조건
			assert calls != null;


		Money result = Money.ZERO;

		for(Call call : calls) {
			result.plus(calculateCallFee(call));
		}

        // 사후조건
        assert result.isGreaterThanOrEqual(Money.ZERO);

		return result;
	}
	
	protected abstract Money calculateCallFee(Call call);
}
