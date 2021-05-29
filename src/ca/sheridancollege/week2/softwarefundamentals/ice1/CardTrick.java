/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
//import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Pranav Mistry
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(1 + (int) (Math.random() * 13));
         c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
         magicHand[i] = c;
         //System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());

         // add c to your magicHand
      }


      Scanner input = new Scanner(System.in);
      int count = 0;
      System.out.println("Pick any Card value from 1-13: ");
      int usrValue = input.nextInt();
      input.nextLine();
      System.out.println("Pick a Suit from [Hearts, Diamonds, Spades, Clubs: ");
      String usrHand = input.nextLine();

      for (int i = 0; i < magicHand.length; i++) {
         count++;
         if (magicHand[i].getValue() == (usrValue) && magicHand[i].getSuit().equals(usrHand)) {

            System.out.println("Congrats! Your card " + magicHand[i].getValue() + " of " + magicHand[i].getSuit() + " is in the Magic Hand.");

            break;
         }
         if (count == magicHand.length) {

            //else {
            //  System.out.println(usrHand);
            System.out.println("Sorry. Your Card " + usrValue + " of " + usrHand + " is not in the Magic Hand.");
            //break;
         }

      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

}
