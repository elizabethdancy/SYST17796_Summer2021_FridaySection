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
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
     
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // add c to your magicHand
            c.setValue((int)(13 * Math.random()) + 1); //generates a random number between 1 - 13
            c.setSuit(Card.SUITS[(int)Math.random() * 4]); //
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);// second input instance is to offset the integer input from the first user input
        
        System.out.println("Guess a card number");
        int guessCard = input.nextInt();
        
        System.out.println("Guess a suit: 'Hearts', 'Diamonds', 'Clubs' or 'Spades'");
        String guessSuit = input1.nextLine();
        
        // and search magicHand here
        boolean isCard = false;
        
        for (int i = 0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == guessCard && magicHand[i].getSuit() == guessSuit)
            {
                isCard = true;
            }          
        }
        
        //Then report the result here
        //System.out.println("The Magic Hand is: " + magicHand[i].getValue() );
        if (isCard == true)
        {
            System.out.println("Your input: " + guessCard + " and " +  guessSuit + " is in the Magic hand.");
        }
        else
            System.out.println("Your input: " + guessCard + " and " + guessSuit + " is not in the magic hand.");
    }
    
}
