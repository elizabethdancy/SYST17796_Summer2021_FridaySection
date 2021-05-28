/*
 * Oluwatoyosi Kuponiyi - 991332886
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
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            int value = rand.nextInt(13) + 1;
            int suit = rand.nextInt(4);
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
        
        int card = 0;
        String suit = "";
        boolean isMagicHand = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a card value:");
        card = scan.nextInt();
        System.out.println("Enter a suit value:");
        suit = scan.next();
        
        for (Card mgH : magicHand) {
            if (mgH.getValue() == card && mgH.getSuit().equalsIgnoreCase(suit)) {
                isMagicHand = true;
                break;
            }
        }
        
        if (isMagicHand) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand!");
        }
    }
    
}
