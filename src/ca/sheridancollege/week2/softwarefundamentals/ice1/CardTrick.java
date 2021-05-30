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
 * @modifier Xianjun Wang,  student ID:991439820
 * @Modified on May 29, 2021
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)Math.random()*13+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            // add c to your magicHand
            magicHand[i] = c;
        }
        
        
       /* //ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a card value between 1 and 13: ");
        int uValue = sc.nextInt();
        sc.nextLine();
        System.out.print("Pick a suit among Hearts, Spades, Dimonds and Clubs: ");
        String uSuit = sc.nextLine();
        
        // search user picked card in magicHand
        //Then report the result here
        int n = 0;
        for(Card magicH:magicHand){
            if((magicH.getValue() == uValue) && magicH.getSuit().equalsIgnoreCase(uSuit)){
                System.out.println("Win!");
            }else{
                n++;
            }
            if (n == magicHand.length){
                System.out.println("Fail, try again.");
            }
         }*/
       
        //Add hard coded-luckyCard
        Card luckyCard = new Card(5, "Diamonds");
        
        //search luckyCard in magicHand
        //report the search result
        int n = 0;
        for(Card magicH:magicHand){
            if((magicH.getValue() == luckyCard.getValue()) && magicH.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                System.out.println("Win!");
            }else{
                n++;
            }
            if (n == magicHand.length){
                System.out.println("Fail, try again.");
            }
         } 
    }   
}
