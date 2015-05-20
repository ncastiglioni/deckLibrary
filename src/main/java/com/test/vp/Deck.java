package com.test.vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Deck {

	private static final Logger log = Logger.getLogger( Deck.class.getName() );
	private List<Card> list = new ArrayList<Card>();
	
	public void initDeck(){
		Suits[] suits = Suits.values();
		for(Suits suit:suits ){
			for(int i=0; i<12;i++){
				list.add(new Card(i+1, suit));
				
			}
		}
	}
	
	public List<Card> getDeck(){
		return this.list;
	}
	
	public Card getFirstCardDeck(){
		return (list.get(list.size()-1));		
	}
	
	public List<Card> shuffleDeck(){
		Collections.shuffle(list);
		return list;
	}
	
	public Card getCard(){
		Random random = new Random();
		int randomicNumber= random.nextInt(list.size());
		return list.get(randomicNumber);
	}
	
	public void printDeck(){
		log.info(this.list.toString());
	}
}
