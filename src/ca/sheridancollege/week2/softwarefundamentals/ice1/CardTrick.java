/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.*;
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
            c.setValue((int)(Math.random()*13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random suit = new Random();
            int a = suit.nextInt(3);
            c.setSuit(Card.SUITS[a]);
            // add c to your magicHand
             magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
       /* Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the card suit");
        String ans1 = input.nextLine();
        
        System.out.println("Enter the card value");
        int ans = input.nextInt();*/
        
        Card luckyCard = new Card();
        String ans1 = "Spades";
        int ans = 5;
        luckyCard.setSuit(ans1);
        luckyCard.setValue(ans);
       
        // and search magicHand here
        //Then report the result here
        for(int i = 0; i < magicHand.length; i++){
            if(ans == magicHand[i].getValue() && ans1.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                System.out.println("your card is in magic hand");
                return;
            }
        }
            System.out.println("your card is not in magic hand");
            
        }
    }
    

