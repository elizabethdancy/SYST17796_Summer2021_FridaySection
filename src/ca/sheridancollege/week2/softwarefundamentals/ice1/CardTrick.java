/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects,
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here),
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // add c to your magicHand.
            //().
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magic and here
        //Then report the result here
        Scanner input = new Scanner(System.in);
        Card luckycard = new Card();
        System.out.println("Please enter a card between 1 and 13");
        int gvalue = input.nextInt();
        luckycard.setValue(gvalue);
    System.out.println("Enter a suit: 1(Heart), 2(Diamonds), 3(Spades) , 4(clubs)");
    int gsuites = input.nextInt();
    luckycard.setsuit{card.suits[gsuits-1]);
    // and see magicHand here 
    boolean match = true;
    for ( int i=0; i<magicHand.length;i++)(
        
        if(luckycard.getvalue() == magicHand[i].getvalue()  && luckycard.getsuit == magicHand[i].getsuit()))(
        available = true;
        else (available=false;)
        if(available){
            System.out.println("Congrats, you won");
          else()
          System.out.println("You lost")  ;
        }
        }
    }
               //finally complete.
        
 
    }
        }
}
