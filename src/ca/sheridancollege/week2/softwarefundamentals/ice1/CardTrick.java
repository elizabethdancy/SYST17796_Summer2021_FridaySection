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
 * @author Manpreeet Kaur, 991608072
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scanner = new Scanner(System.in);

        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             c.setValue((int) (Math.random() * 14 + 1)); //c.setValue(insert call to random number generator here)
             Random suits = new Random();

            int first = suits.nextInt(3);
            c.setSuit(Card.SUITS[first]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
              magicHand[i] = c; // add c to your magicHand
        }
        Card luckyCard = new Card();

        String finalSuit = "Spades";
        int finalValue = 9;

        luckyCard.setSuit(finalSuit);
        luckyCard.setValue(finalValue);
        
        //insert code to ask the user for Card value and suit, create their card
       
        System.out.print("Enter the card Suit: ");
        String suit1 = scanner.nextLine();

        System.out.print("Enter the Card value in numbers: ");
        int value1 = scanner.nextInt();
        
        // and search magicHand here
        //Then report the result here
        for (int counter = 0; counter < magicHand.length; counter++) {
                if (suit1.equalsIgnoreCase(magicHand[counter].getSuit()) && value1 == magicHand[counter].getValue()) {
                        System.out.println(" Congratulations, your card is in the Magic Hand");
                   
                }
                   System.out.println("Sorry, your card is not in the Magic Hand !");
                }
       
          for (Card index : magicHand) {

                    if (suit1.equalsIgnoreCase(index.getSuit())) {
                        if (value1 == index.getValue()) {
                            System.out.println("Yes, you have Won !!!");
                        }
                    } else {
                        System.out.println("Oops, try Again next time!!");
                    }
                }
    }
    
    }

