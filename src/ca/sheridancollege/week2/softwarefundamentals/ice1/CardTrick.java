/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Mario Martinez (991 362 634)
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        int randomSuit, randomValue;
        for (int i = 0; i < magicHand.length; i++) {
            randomSuit = ThreadLocalRandom.current().nextInt(1, 4 + 1);
            randomValue = ThreadLocalRandom.current().nextInt(1, 13 + 1);

            Card c = new Card(randomSuit, randomValue);
            magicHand[i] = c;

            // Code to test that all card combinations are coming up properly
            //System.out.println(magicHand[i].toString());
        }

        //insert code to ask the user for Card value and suit, create their card
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("\nPick a card!\n");

        System.out.println("Hearts = 1, Diamonds = 2, Spades = 3, Clubs = 4");
        System.out.print("What suit (1-4)? ");
        int intSuitGuess = input.nextInt();
        System.out.print("What value (1-13)? ");
        int valueGuess = input.nextInt();
        
        String suitGuess;
        if (intSuitGuess == 1) {
            // "Hearts"
            suitGuess = "Hearts";
        } else if (intSuitGuess == 2) {
            // "Diamonds"
            suitGuess = "Diamonds";
        } else if (intSuitGuess == 3) {
            // "Spades"
            suitGuess = "Spades";
        } else if (intSuitGuess == 4) {
            // "Clubs"
            suitGuess = "Clubs";
        } else {
            throw new IllegalArgumentException("suitGuess " + intSuitGuess + "is out of range! (1-4)");
        }
        */
        
        Card luckyCard = new Card(1, 1);
        String suitGuess = luckyCard.getSuit();
        int valueGuess = luckyCard.getValue();
        
        System.out.println("Lucky card is:");
        System.out.println(luckyCard.toString());
        // and search magicHand here
        String cardSuit;
        int cardValue;
        boolean suitMatch = false, valueMatch = false;
        Card matchingCard = new Card();

        for (int i = 0; i < magicHand.length; i++) {
            cardSuit = magicHand[i].getSuit();
            if (cardSuit.equals(suitGuess)) {
                suitMatch = true;
            } else {
                suitMatch = false;
            }
            
            cardValue = magicHand[i].getValue();
            if (cardValue == valueGuess) {
                valueMatch = true;
            } else {
                valueMatch = false;
            }
            
            if (suitMatch && valueMatch) {
                matchingCard = magicHand[i];
            }
        }
        
        //Then report the result here
        
        if (suitMatch && valueMatch) {
            System.out.println("You guessed correctly!");
            System.out.println(matchingCard.toString());
        } else {
            System.out.print("Incorrect!");
        }
    }

}

/**
 * TEST RUN
 * 
 * Lucky card is:
 * Suit: Hearts 
 * Value: 1
 * 
 * Incorrect!BUILD SUCCESSFUL (total time: 1 second)
 */