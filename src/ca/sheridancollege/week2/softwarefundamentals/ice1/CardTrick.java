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
 * @modifier Karman Singh Dhadda 
 * @student number 991626993
 */
import java.util.Scanner;
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
            c.setValue((int)Math.floor(Math.random() * 13+1));
             c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card luckyCard = new Card();
        System.out.println("Enter a card between 1 and 13: ");
        int gValue = input.nextInt();
        luckyCard.setValue(gValue);
        System.out.println("Enter a suit: 1(Hearts), 2(Diamonds), 3(Spades), 4(Clubs)");
        int gSuits = input.nextInt();
        luckyCard.setSuit(Card.SUITS[gSuits-1]);
        // and search magicHand here
        boolean match = true;
        for(int i=0; i<magicHand.length; i++){
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit() == magicHand[i].getSuit()){
                match = true;
                break;
             } else {
                match = false;
             }
       }   
        //Then report the result here
        if(match){
            System.out.println("Your card is in the magic hand, YOU WON !!!");
        } 
        else {
            System.out.println("Your card is not in the magic hand, YOU LOSE, Better Luck Next Time!");

        }
    }
    
}
