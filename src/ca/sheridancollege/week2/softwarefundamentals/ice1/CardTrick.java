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
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner input = new Scanner(System.in);
        Card luckeyCard = new Card();
        System.out.println("Enter card between 1 to 10");
        int cvalue = input.nextInt();
        luckeyCard.setValue(cvalue);
        System.out.println("Enter a suit: 1(Spades), 2(Heart), 3(Clubs), 4(Diamond)");
        int csuits = input.nextInt();
        luckeyCard.setSuit(Card.SUITS(csuits-1));
        boolean match = true;
        for(int i = 0; i<magicHand.length; i++)
            if(luckyCard.getValue()== magicHand[i].getValue()&& luckeyCard.getSuit()== magicHand[i].getSuit())
            {
                match = true;
                break;
            }
            else {
                match = false; 
            }

    }
    
    if(match)
    {
        System.out.println("You Won");
    }
    else
    {
        System.out.println("You Loose");
    }
}
