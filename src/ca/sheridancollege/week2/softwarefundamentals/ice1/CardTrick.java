/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.*;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Arshpreet kaur
 * Student ID : 991628865
 * 30 May, 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random Number1 = new Random();
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(Number1.nextInt(13)+ 1);                //c.setValue(insert call to random number generator)
            c.setSuit(Card.SUITS[Number1.nextInt(4)]);         //c.setSuit(Card.SUITS[insert call to random number between 0-3])
            magicHand[i] = c;                                  //add c to your magicHand
        }
       
         Card  Card1 = new Card();
            boolean Value = false;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the value of card in between 1-13:");      //insert code to ask the user for Card value and suit, create their card
            int ValueOfCard = input.nextInt();

            System.out.println("Enter a type of Suit from deck of cards- Diamonds, Spades, Hearts, Clubs:");
            String TypeOfSuit = input.next();

         Card1.setValue(ValueOfCard);
         Card1.setSuit(TypeOfSuit);
         
         for(int i = 0; i< magicHand.length; i++){                        //search magicHand here
            if(magicHand[i].getValue() == Card1.getValue() && (magicHand[i].getSuit().equalsIgnoreCase(Card1.getSuit())))
            {
                Value = true;
                break;
            }
        }
            if(Value)
                System.out.println("ohh great! You are winner");
            else
                System.out.println("oh no! You lost the game");

    }
    
}
