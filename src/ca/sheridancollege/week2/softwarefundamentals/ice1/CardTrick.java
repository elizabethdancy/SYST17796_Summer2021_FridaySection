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
 // Saravdeep Singh
 //Student ID- 991631189

public class CardTrick {
    
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random()* 13)+1);
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()* 4)+0]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card luckyCard = new Card();
        System.out.println("Enter one card between 1 and 13: ");
        int userValue = input.nextInt();
        luckyCard.setValue(userValue);
        System.out.println("Enter one suit- 1[Hearts], 2[Clubs], 3[Diamonds], 4[Spades]");
        int luckSuits = input.nextInt();
        
        luckyCard.setSuit(Card.SUITS[ luckSuits-1]);
        
        // and search magicHand here
        
        boolean available = true;
        for (Card magicHand1 : magicHand) { 
            if (luckyCard.getValue() == magicHand1.getValue() && luckyCard.getSuit().equals(magicHand1.getSuit())) {
                available = true;
                break;
            } else {
                available= false;
            }
        }
        
        //Then report the result here
        if(available){
            System.out.println("Your choosen card is in magic hand!!!!");          
        } else {
            System.out.println("Your choosen card is not there in magic hand!!!!");
        }
    }
} 
