package com.test.vp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	private static final Logger log = Logger
			.getLogger(DeckTest.class.getName());

	Deck deck = null;

	@Before
	public void setUp() throws Exception {
		deck = new Deck();
		deck.initDeck();
	}

	@Test
	public void testInit() {
		assertNotNull(deck);
		log.info("Initializing Deck...");
		deck.printDeck();
	}

	@Test
	public void testGetCard() {
		Card card = deck.getCard();
		assertNotNull(card);
		int indexOfCard = deck.getDeck().indexOf(card);
		log.info("Get Card = " + card.toString() + "Index of card="
				+ indexOfCard);
		assertTrue(indexOfCard > 0 && indexOfCard < deck.getDeck().size());
	}

	@Test
	public void testGetFirstCardDeck() {
		Card card = deck.getFirstCardDeck();
		assertNotNull(card);
		int index = deck.getDeck().indexOf(card);
		log.info("First Card Deck is:" + card.toString()
				+ "Index of First Card Deck is:=" + index);
		assertTrue(0 == index);
	}

	@Test
	public void testGetLastCardDeck() {
		Card card = deck.getLastCardDeck();
		assertNotNull(card);
		int index = deck.getDeck().indexOf(card);
		log.info("First Card Deck is:" + card.toString()
				+ "Index of First Card Deck is:=" + index);
		assertTrue((deck.getDeck().size() - 1) == index);
	}

	@Test
	public void testShuffle() {
		log.info("Deck before shuffle " + deck.getDeck());
		deck.shuffleDeck();
		log.info("Deck after shuffle " + deck.getDeck());

	}

}
