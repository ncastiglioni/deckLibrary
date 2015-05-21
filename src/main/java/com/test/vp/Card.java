package com.test.vp;

public class Card {

	private Value value;
	private Suit suit;

	public Card(Value value, Suit suit) {
		super();
		this.value = value;
		this.suit = suit;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ", suit=" + suit + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}



}
