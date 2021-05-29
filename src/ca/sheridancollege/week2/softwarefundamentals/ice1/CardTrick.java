/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
//import java.util.Random;
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


      
      int count = 0;
      Card luckyCard = new Card();
      luckyCard.setValue(3);
      luckyCard.setSuit("Hearts");
      for (int i = 0; i < magicHand.length; i++) {
         count++;
         if (magicHand[i].getValue() == (luckyCard.getValue()) && magicHand[i].getSuit().equals(luckyCard.getSuit())) {

            System.out.println("Congrats! Your card " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is in the Magic Hand.");

            break;
         }
         if (count == magicHand.length) {

            //else {
            //  System.out.println(usrHand);
            System.out.println("Sorry. Your Card " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is not in the Magic Hand.");
            //break;
         }

      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

}
