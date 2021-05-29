/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects`
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * modified by priyanka lakhera on 29th may
  */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            c.setValue((rand.nextInt(13))+ 1 );  //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[rand.nextInt(3)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c ;  // add c to your magicHand
            System.out.println(magicHand[i]);
        }
       
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Guess the card");
        Scanner sc = new Scanner(System.in);
        String userCard = sc.nextLine();
        
        // and search magicHand here
        boolean present= false;
      for(int i =0; i<magicHand.length; i++){
          if( userCard.equalsIgnoreCase(magicHand[i].toString())){
              present = true;             
          }          
         
    }
       
        //Then report the result here
    if(present)
         System.out.println("Yay!! Your card is in the magic hand");
    else
        System.out.println("Oops!! Your card is not in the magic hand");
}
}
