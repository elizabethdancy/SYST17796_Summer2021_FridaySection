/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */

// Edgar Vellojin - 991621681
import java.util.Scanner;
import java.util.Arrays;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        System.out.println("Magic Hand");
        System.out.println("--------------------------------------------------");
                
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random() * 13)+1);
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        System.out.println(Arrays.toString(magicHand));
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
        //insert code to ask the user for Card value and suit, create their card
        /*
	Scanner	input = new Scanner(System.in);
	System.out.print("Enter the card: ");
        int cardNum = input.nextInt();
        
        Scanner	input1 = new Scanner(System.in);
        System.out.print("Enter the suit: ");
        String suit=input1.nextLine();
        
        // and search magicHand here
        System.out.println(cardNum + " of " +  suit);
	*/
	Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
	luckyCard.setValue(7);
        System.out.println("Lucky Card: " + luckyCard.getValue() + " of " +  luckyCard.getSuit());
        
        boolean cardInside = false;
        
        for (int i =0; i<magicHand.length; i++) 
        {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit()))
                cardInside= true;
        }
        
        if (cardInside == true)
            System.out.println("You Win, the luckyCard: " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is IN the magicHand, Congratulations !!!");
        else
            System.out.println("You Lose, the luckyCard: " + luckyCard.getValue() + " of " + luckyCard.getSuit() + " is NOT IN the magicHand, Try again ...");
        
    }
    
}
