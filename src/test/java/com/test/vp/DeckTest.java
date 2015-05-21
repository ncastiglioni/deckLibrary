package com.test.vp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import com.test.vp.card.Card;
import com.test.vp.deck.Deck;

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
	public void testTopCard() {
		int originalSizeDeck = deck.getDeck().size();
		Card card = deck.getTopCardDeck();
		assertNotNull(card);
		log.info("First Card Deck is:" + card.toString());
		assertTrue((deck.getDeck().size() + 1) == originalSizeDeck);
	}

	@Test
	public void testGetCard() {
		int originalSizeDeck = deck.getDeck().size();
		Card card = deck.getCard();
		assertNotNull(card);
		log.info("Get Card = " + card.toString());
		assertTrue((deck.getDeck().size() + 1) == originalSizeDeck);
	}

	@Test
	public void testShuffle() {
		log.info("Deck before shuffle " + deck.getDeck());
		deck.shuffleDeck();
		log.info("Deck after shuffle " + deck.getDeck());

	}

}
