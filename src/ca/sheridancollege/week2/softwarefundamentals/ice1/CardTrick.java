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
 *
 * @author dancye
 * @author William Ibarra Student ID: 991625901 modified May 28, 2021
 */
public class CardTrick
{ //class start

   public static void main (String[] args)
   { //main method start
      Card[] magicHand = new Card[7]; //stores 7 cards
      Random rndNum = new Random(); //Make sure to import java.util.Random. Create Random object to use nextInt() method
      //Card luckyCard = new Card(); //stores the user's card choice
      Scanner input = new Scanner(System.in); //import scanner here

      //load array for each magicHand[i] set the card value and suit
      for (int i = 0; i < magicHand.length; i++) {
         magicHand[i] = new Card();
         magicHand[i].setValue(rndNum.nextInt(13) + 1); //inserts random number from 1 - 13
         magicHand[i].setSuit(Card.SUITS[rndNum.nextInt(3)]); //inserts random number from 0 - 3. SUITS[i] changes per int
         System.out.println("Card #: " + i + " Value is: " + magicHand[i].getValue() + " Suit is: " + magicHand[i].getSuit());
      }

      //insert code to ask the user for Card value and suit, create their card
      //set card value
      System.out.println("\nPick a card value from 1 - 13");
      int cardNum = input.nextInt();
      input.nextLine(); //using .nextLine() to fix .nextInt() \n problem
      luckyCard.setValue(cardNum);

      //set card suit
      System.out.println("Pick a suit: hearts, diamonds, spades, clubs");
      String cardSuit = input.nextLine();

      if (cardSuit.equals("hearts")) {
         luckyCard.setSuit(Card.SUITS[0]);
      }
      else if (cardSuit.equals("diamonds")) {
         luckyCard.setSuit(Card.SUITS[1]);
      }
      else if (cardSuit.equals("spades")) {
         luckyCard.setSuit(Card.SUITS[2]);
      }
      else if (cardSuit.equals("clubs")) {
         luckyCard.setSuit(Card.SUITS[3]);
      }
      System.out.println("\nYou picked value: " + luckyCard.getValue() + ". You picked suit: " + luckyCard.getSuit());


      //search magicHand here
      boolean found = false;

      for (int i = 0; i < magicHand.length; i++) {
         if ((magicHand[i].getValue() == (luckyCard.getValue())) && (magicHand[i].getSuit().equals(luckyCard.getSuit()))) {
            found = true;
         }
      }
      if (found) {
         System.out.println("I am holding your card value of: " + luckyCard.getValue() + ". Suit: " + luckyCard.getSuit());
      }
      else {
         System.out.println("I am not holding your card.");
      }
   } //main method ends
}//class ends

