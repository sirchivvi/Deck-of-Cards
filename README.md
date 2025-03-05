Card Deck Java Program
Overview

This Java program simulates a deck of 52 playing cards with various functionalities like shuffling, dealing, comparing, and searching for cards. It follows an Object-Oriented Programming (OOP) approach and uses ArrayList to store the deck.
Features

The program includes the following functionalities:
1. createDeck()

    Creates a deck of 52 unique playing cards.
    Each card has a suit (Hearts, Diamonds, Clubs, Spades) and a rank (Ace, 2, 3, ..., King).

2. printDeck()

    Prints all 52 cards in the deck.

3. printCard(Card card)

    Prints the details (rank and suit) of a specific card.

4. sameCard(Card card)

    Finds and prints all cards that share the same suit as the given card.

5. compareCard(Card card1, Card card2)

    Checks if two cards have the same rank.

6. findCard(String rank, String suit)

    Searches for a specific card in the deck by rank and suit.

7. dealCard()

    Randomly selects and prints five cards from the deck.

8. shuffleDeck()

    Randomly shuffles the entire deck.

File Structure

The program consists of multiple Java files:

    Main.java - Contains the menu-driven implementation to call different methods.
    Card.java - Defines the Card class with attributes for rank and suit.
    Deck.java - Implements the methods for deck creation, printing, shuffling, and other operations.


