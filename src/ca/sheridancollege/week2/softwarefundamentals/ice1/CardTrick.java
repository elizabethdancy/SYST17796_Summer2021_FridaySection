/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Vinoshan Kugendran| 991361864
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pSuit = "";
        int pValue = 0, x = 0;
        int[] result = new int[7];
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 14));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            // add c to your magicHand
            magicHand[i] = c;
        }

        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i]);
        }

        Card pCard = new Card();

        //insert code to ask the user for Card value and suit, create their card
        while (x != 1) {
            System.out.println("Enter the Suit of Card(Hearts, Diamonds, Clubs, Spades)");
            pSuit = scan.next();

            if (pSuit.equals("Hearts") == true || pSuit.equals("Diamonds") == true || pSuit.equals("Clubs") == true || pSuit.equals("Spades") == true) {
                x = 1;
            } else {
                System.out.println("You must pick Hearts or Diamonds or Clubs or Spades \n");
            }
        }

        x = 0;

        while (x != 1) {
            System.out.println("Enter the Value of Card (1 (Ace),2,3,4,5,6,7,8,9,10,11 (Jack ),12 (Queen),13 (King))");
            pValue = scan.nextInt();

            if (pValue >= 1 && pValue <= 13) {
                x = 1;
                
            } else {
                System.out.println("You must enter a number between 1 and 13 \n");
            }
        }
        pCard.setSuit(pSuit);
        pCard.setValue(pValue);

        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            
            //Win
            if(pCard.toString().equals(magicHand[i].toString()))
                result[i] = 1;
            
            //Loss
            else
                result[i] = 0;
        }
        
        //Then report the result here
       
        for (int i = 0; i < magicHand.length; i++) {
            //Results Win
            if (result[i] == 1)
                System.out.println("You have found a match! Your " + pCard.toString() + " matched with Magic" + magicHand[i].toString());
        }
    }

}
