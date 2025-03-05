//Name : Akhil Chivukula
//Prn : 23070126009
//Batch : AIML A1

import java.util.Scanner;

// DeckOfCards.java - A menu-driven program to manage a deck of playing cards.

public class DeckOfCards {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); // Scanner for user input
    	Deck deck = new Deck(); // Create a new deck of cards

    	while (true) {
        	// Display menu options
        	System.out.println("\n--- Deck Operations Menu ---");
        	System.out.println("1. Print Deck");
        	System.out.println("2. Find a Card");
        	System.out.println("3. Deal 5 Random Cards");
        	System.out.println("4. Shuffle Deck");
        	System.out.println("5. Compare Two Cards (Same Suit?)");
        	System.out.println("6. Compare Two Cards (Same Rank?)");
        	System.out.println("7. Exit");
        	System.out.print("Enter your choice: ");

		// Ensure valid input
        	if (!sc.hasNextInt()) {
            	System.out.println("Invalid input! Please enter a number.");
            	sc.next(); // Clear the invalid input
            	continue;
        	}

        	int choice = sc.nextInt();
        	sc.nextLine(); // Consume the leftover newline character

        	switch (choice) {
            	case 1 -> deck.printDeck(); // Print all cards in the deck

            	case 2 -> {
                	// Prompt user for rank and suit of the card they want to find
                	System.out.print("Enter rank (e.g., Ace, King, 10): ");
                	String rank = sc.nextLine().trim();

                	System.out.print("Enter suit (e.g., Hearts, Diamonds): ");
                	String suit = sc.nextLine().trim();

