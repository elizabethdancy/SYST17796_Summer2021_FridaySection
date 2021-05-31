/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Gabriel Oko-Oboh
 * @Student ID: 991440581
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
  
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random()*13)+1);//c.setValue(insert call to random number generator here)
            c.getValue();
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()*4)+0]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.getSuit();
            magicHand[i] = c;// add c to your magicHand
        }
        
        Card luckyCard = new Card();
        System.out.println("Please enter the Card value between 1 & 13: ");//insert code to ask the user for Card value and suit, create their card
        int cardValue;
        cardValue = input.nextInt();
        luckyCard.setValue(14);
        
        System.out.println("Please enter the Card suit out of these options: 1(Clubs), 2(Diamonds), 3(Spades), 4(Hearts)");
        String cardSuit = input.next();
        luckyCard.setSuit(Card.SUITS[3]);
        
        
        // and search magicHand here
        Boolean magicCard = true;
        for (Card magicHand1 : magicHand) {
            if (luckyCard.getValue() == magicHand1.getValue() && luckyCard.getSuit().equals(magicHand1.getSuit())) {
                magicCard = true;
            }           
            //Then report the result here
            if (magicCard) {
                System.out.println("You have won, the card is in the magic hand");
            } else {
                System.out.println("You have lost, the card is not in the magic hand");
            }
        }
    
}
}
