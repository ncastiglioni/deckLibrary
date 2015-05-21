package com.test.vp.main;

import java.util.Scanner;

import com.test.vp.Deck;

public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Scanner consoleOutput = new Scanner(System.in);

		String mainMenu = ("Select a choice from the menu: \n"
				+ "1. Init Deck\n" + "2. Get Top Card from Deck\n"
				+ "3. Shuffle Deck\n" + "4. Get Card (random)\n"
				+ "5. Print Deck\n" + "6. Exit");

		System.out.println(mainMenu);

		int menuSelectedOption = 0;

		do  {			
			menuSelectedOption = consoleOutput.nextInt();

			switch (menuSelectedOption) {
			case 1: {
				deck.initDeck();
				break;
			}
			case 2: {
				deck.getTopCardDeck();
				break;
			}
			case 3: {
				deck.shuffleDeck();
				break;
			}
			case 4: {
				deck.getCard();
				break;
			}
			case 5: {
				deck.printDeck();
				break;
			}
			case 6: {
				System.exit(0);
				break;
			}
			}
		}while (menuSelectedOption != 6);

	}

}
