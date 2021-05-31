/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.concurrent.ThreadLocalRandom;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Mario Martinez (991 362 634)
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        int randomSuit, randomValue;
        for (int i=0; i<magicHand.length; i++)
        {
            randomSuit = ThreadLocalRandom.current().nextInt(1, 4 + 1);
            randomValue = ThreadLocalRandom.current().nextInt(1, 13 + 1);
            
            Card c = new Card(randomSuit, randomValue);
            magicHand[i] = c;
            
            // Code to test that all card combinations are coming up properly
            //System.out.println(magicHand[i].toString());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
