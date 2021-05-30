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
 * @modified by Harmanpreet Kaur
 *  Student ID- 991613179
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)+0]);
            // add c to your magicHand
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        System.out.print("Choose a number of cards between 1 to 13:  ");
        int cardValue = sc.nextInt();
        luckyCard.setValue(cardValue);
        System.out.print("Choose one suit of cards- 1(Clubs), 2(Hearts), 3(Spades), 4(Diamonds):  ");
        int cardsSuit = sc.nextInt();
        luckyCard.setSuit(Card.SUITS[ cardsSuit-1]);

        // and search magicHand here
       boolean match = true;
        for (int i=0; i<magicHand.length; i++){ 
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                match = true;
                break;
            } else {
                match= false;
            }
        }
       
        //Then report the result here
        
    
}
