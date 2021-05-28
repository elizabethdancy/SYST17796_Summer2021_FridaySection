
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
 * @modified Kiu So 991627604
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            // add c to your magicHand
            magicHand[i] = c;
        }
        
        for (Card s: magicHand){
            System.out.println(s.getValue());
            System.out.println(s.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        Card g = new Card();
        System.out.println("Pick a card value: 1-13");
        int gValue = input.nextInt();
        g.setValue(gValue);
        System.out.println("Pick a suit!: 1(Hearts), 2(Diamonds), 3(Spades), 4(Clubs)");
        int gSuit = input.nextInt();
        g.setSuit(Card.SUITS[gSuit-1]);
        
        // and search magicHand here
        boolean match = true;
        for(int i=0; i<magicHand.length; i++){
            if(g.getValue() == magicHand[i].getValue() && g.getSuit() == magicHand[i].getSuit()){
                match = true;
                break;
            } else {
                match = false;
            }
        }
        
        //Then report the result here
        if(match){
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand!");
        }

    }
    
}
