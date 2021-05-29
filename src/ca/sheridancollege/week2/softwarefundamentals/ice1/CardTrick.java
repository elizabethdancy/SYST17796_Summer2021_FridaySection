
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Nusrath 991627519
 */
public class CardTrick {
    
    public static void main(String[] args){
        
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner input= new Scanner(System.in);

        for (int i=0; i<magicHand.length; i++) {
            
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(14)+1);
            //c.setSuit(Card.SUITS[insert call to random numberbetween 0-3 here])
            c.setSuit(Card.SUITS[(random.nextInt(4))]);
            //add c to your magicHand
            magicHand[i] = c;
         System.out.println(c.getValue() + " of " + c.getSuit());

        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       
       System.out.println("\nPick any card value from 1-13: ");
        int getValue= input.nextInt();
        
        System.out.println("Pick any card Suit");
        String getSuits = input.next(); 
        
        for (Card magicHand1 : magicHand) {
            
        if(getValue== magicHand1.getValue() && getSuits.equals(magicHand1.getSuit()))
        System.out.println("It matches!");
        else {
            System.out.println("Does not Match");
        }
        }
    }
        
}


    

