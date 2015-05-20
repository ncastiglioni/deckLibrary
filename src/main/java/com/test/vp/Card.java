package com.test.vp;

public class Card {

	private int number;
	private Suits suit;

	public Card(int number, Suits suit) {
		super();
		this.number = number;
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Suits getSuit() {
		return suit;
	}

	public void setSuit(Suits suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [number=" + number + ", suit=" + suit.toString() + "]";
	}

}
