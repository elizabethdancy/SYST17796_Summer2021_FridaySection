/*
Name: Akashdeep Patel
StudentNo.: 991619545
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random RG=new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(RG.nextInt(10) + 1 );//insert call to random number generator here
            c.setSuit(Card.SUITS[RG.nextInt(3) + 0]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;// add c to your magicHand
            //System.out.println(c.getValue());
            //System.out.println(c.getSuit());
        }
        
        int x=0,y=0;
        Card UserInput=new Card();
        
        System.out.println("Enter a card(1-13): ");
        int Cvalue=sc.nextInt();
        UserInput.setValue(Cvalue);
        System.out.println("Enter a suit(0-3): ");
        int Csuit=sc.nextInt();
        UserInput.setSuit(Card.SUITS[Csuit]);
        System.out.println("\n");
        //System.out.println(UserInput.getValue());
        //System.out.println(UserInput.getSuit());
        
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue()==UserInput.getValue() && magicHand[i].getSuit()==UserInput.getSuit()){
                System.out.println("Array contains the card you entered!!");
                x=1;
            }
        }
        if(x==0){
            System.out.println("Array does not contain the card you entered!!");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Card luckyCard=new Card("Hearts",1);
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue()==luckyCard.getValue() && magicHand[i].getSuit()==luckyCard.getSuit()){
                System.out.println("A match!! You have won!!");
                y=1;
            }
        }
        if(y==0){
            System.out.println("Hard luck.. Better luck next time!!");
        }
    }
    
}
