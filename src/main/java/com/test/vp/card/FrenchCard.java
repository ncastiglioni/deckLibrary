package com.test.vp.card;

public class FrenchCard implements Card {

	private Value value;
	private Suit suit;

	public FrenchCard(Value value, Suit suit) {
		super();
		this.value = value;
		this.suit = suit;
	}

	public String getValue() {
		return value.toString();
	}

	public String getSuit() {
		return suit.toString();
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [" + value.toString() + ", " + suit.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FrenchCard other = (FrenchCard) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	
}
