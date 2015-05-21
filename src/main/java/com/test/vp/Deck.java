package com.test.vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Deck {

	private static final Logger log = Logger.getLogger(Deck.class.getName());
	private List<Card> list = new ArrayList<Card>();

	public void initDeck() {
		Suit[] suits = Suit.values();
		for (Suit suit : suits) {
			for (int i = 1; i < 13; i++) {
				this.list.add(new Card(i, suit));

			}
		}
	}

	public List<Card> getDeck() {
		return this.list;
	}

	/**
	 * get the card on the top of the deck
	 * 
	 * @return Card
	 */
	public Card getTopCardDeck() {
		Card card = this.list.get(this.list.size() - 1);
		this.list.remove(card);
		log.info("Card = " + card);
		return card;
	}

	/**
	 * suffleDeck
	 */
	public void shuffleDeck() {
		Collections.shuffle(this.list);
	}

	/**
	 * getCard gives a card from the deck and remove it from the deck
	 * 
	 * @return Card
	 */
	public Card getCard() {
		Random random = new Random();
		int randomicNumber = random.nextInt(this.list.size());
		Card card = this.list.get(randomicNumber);
		this.list.remove(card);
		log.info("Card = " + card);
		return card;
	}

	public void printDeck() {
		log.info("Deck size = "+ this.list.size() + " - Elements: "+ this.list.toString());
	}
}
