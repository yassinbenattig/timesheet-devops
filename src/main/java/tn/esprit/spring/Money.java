package tn.esprit.spring;

import java.util.Objects;

public class Money {
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Money)) {
			return false;
		}
		Money other = (Money) o;
		if (other.fAmount == this.fAmount && other.fCurrency == this.fCurrency)
			return true;
		return false;
	}

	public int hashCode() {
		return Objects.hash(fAmount, fCurrency);
	}
}
