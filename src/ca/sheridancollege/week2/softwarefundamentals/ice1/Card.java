/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13) A
 * suit (clubs, hearts, spades, diamonds). There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author dancye, changing a comment
 * @author Mario Martinez (991 362 634)
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card(int randomSuit, int randomValue) {
        if (randomSuit == 1) {
            // "Hearts"
            setSuit(SUITS[0]);
        } else if (randomSuit == 2) {
            // "Diamonds"
            setSuit(SUITS[1]);
        } else if (randomSuit == 3) {
            // "Spades"
            setSuit(SUITS[2]);
        } else if (randomSuit == 4) {
            // "Clubs"
            setSuit(SUITS[3]);
        } else {
            throw new IllegalArgumentException("randomSuit " + randomSuit + "is out of range! (1-4)");
        }
        
        if (randomValue >= 1 && randomValue <= 13) {
            setValue(randomValue);
        } else {
            throw new IllegalArgumentException("randomValue" + randomValue + "is out of range! (1-13)");
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("Suit: %s\n Value: %s\n", suit, value);
    }

}
