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
 * Manjot Kaur 991597026
 * 30th May,2021
 */
 import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
         Random randomNumber  = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
       
            c.setValue(randomNumber.nextInt(13)+1);
            c.setSuit(Card.SUITS[randomNumber.nextInt(4)]);
            magicHand[i]=c;
        }
        Card Mycard=new Card();
        boolean Inspect=false;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of card(1-13)");
        int  selectValue=input.nextInt();
        System.out.println("Choose a type of card (Diamonds,Hearts,Spades,Clubes)");
        String selectSuit=input.next();
        Mycard.setValue(selectValue);
        Mycard.setSuit(selectSuit);
       for(int i=0; i<magicHand.length; i++)
            {
                if(magicHand[i].getValue() == Mycard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(Mycard.getSuit()))
                {
                    Inspect = true;
                    break;
                }
            }
            
            if(Inspect)
                System.out.println("Congrats! Your card matched");
            else
           System.out.println("oops! card not matched");
    }
}
	 

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // add c to your magicHand
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

