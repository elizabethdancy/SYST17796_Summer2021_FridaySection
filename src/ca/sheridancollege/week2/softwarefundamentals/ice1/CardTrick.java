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
 */
public class CardTrick {
   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i]=c;       
        }
        
         for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuit() + " " + magicHand1.getValue());
        }
         System.out.println("Pick a card, any card");
        System.out.println("Pick the card value");

      int UserValue = input.nextInt();
        System.out.println("Pick the card suit");
                System.out.println("1 = Hearts, 2 = Diamonds, 3 = Spades, 4 = Clubs");

        int UserSuit = input.nextInt();

        System.out.println("Your card is: " + UserValue + " of " + UserSuit);
                System.out.println("Let's see if your card is in the magic hand");

  // if(UserValue== magicHand1.getValue() || UserSuit == magicHand1()){
    //System.out.println("Great job");
     //}
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
