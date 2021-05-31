/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye 
 * @modifier Lucas Donegan doneganl 991637725 2021-05-28
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rn = new Random();
        Scanner in = new Scanner(System.in);
        
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Clubs");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rn.nextInt(13 - 1 + 1) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rn.nextInt(3 - 0 + 1) + 0]);
            // add c to your magicHand
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " of "
                    + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /*
        Card playerCard = new Card();
        System.out.print("Pick a card value: \n");
        playerCard.setValue(in.nextInt());
        
        System.out.println("Pick a card suit: ");
        playerCard.setSuit(in.next());
        */
        // and search magicHand here
        
        
        
        for(int i=0; i<magicHand.length; i++) {
            if (luckyCard.getSuit().compareTo(magicHand[i].getSuit()) == 0){
                if (luckyCard.getValue() == magicHand[i].getValue()){
                  System.out.println("Your card was in the Deck! Magic!");
                } else {
                    System.out.println("your card was not in the deck");
                }
            } else if (i == 7){
                System.out.println("your card was not in the deck");
            }
    } 
 }
}
