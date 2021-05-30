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
 * @modifier Hasini
 * @studentName 991641886
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        boolean luck = false;
        int guessValue;
        int guessSuit;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int value = (int)(Math.random()*13 + 1);
            c.setValue(value);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suitnum = (int)(Math.random()*4);
            c.setSuit(Card.SUITS[suitnum]);
            // add c to your magicHand
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card guess = new Card();
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Pick a Card value (A number between 1 and 13 - 1 for Ace | 11 for Jack | 12  for Queen | 13 for King): ");
            guessValue = scanner.nextInt();
        } while (guessValue < 1 || guessValue >13 );
        guess.setValue(guessValue);

        do{
            System.out.println("Pick a suit: 0 for Hearts | 1 for Diamonds | 2  for Spades | 3 for Clubs");
            guessSuit = scanner.nextInt();
        } while (guessSuit < 0 || guessSuit >3 );
        guess.setSuit(Card.SUITS[guessSuit]);
                   
        System.out.println("Your guess card: " + guess.getValue() + " of " + guess.getSuit());
        
        // and search magicHand here
        for (int i=0; i< magicHand.length; i++){
            if(magicHand[i].getValue()== guess.getValue() && magicHand[i].getSuit()==guess.getSuit()){
                luck = true;
            }
        }
                
        //Then report the result here
        if (luck == true){
            System.out.println("Your guess is correct");
        }else{
            System.out.println("Your card was not in the Magic Hand");
        }
        
        System.out.println("---------Magic Hand------------");
        for (int i=0; i< magicHand.length; i++){
            System.out.println("Card " + (i+1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }   
    } 
}
