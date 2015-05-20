package com.test.vp;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	private static final Logger log = Logger.getLogger( DeckTest.class.getName() );
	
	Deck deck = null;
	
	@Before
	public void setUp() throws Exception {
		deck= new Deck();
		deck.initDeck();
	}

	@Test
	public void testInit() {
		assertNotNull(deck);
		deck.printDeck();
	}
	
	@Test
	public void getCard(){
		Card card = deck.getCard();
		log.info(card.toString());
		assertNotNull(card);
		int indexOfCard =deck.getDeck().indexOf(card);
		log.info("Index="+indexOfCard);
		assertTrue(indexOfCard>0 && indexOfCard<deck.getDeck().size());
	}
	
	@Test
	public void getFirstCardDeck(){
		Card card = deck.getFirstCardDeck();
		log.info(card.toString());
		assertNotNull(card);
		int indexOfCard =deck.getDeck().indexOf(card);
		log.info("Index="+indexOfCard);
		assertTrue(indexOfCard==(deck.getDeck().size()-1));
	}
	
	//TODO mañana completar test de shuffle

}
