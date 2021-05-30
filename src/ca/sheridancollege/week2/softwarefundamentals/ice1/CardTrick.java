/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and check if Lucky Card (8 of Diamond) is in the Magic Hand.
 * To be used as starting code in ICE 1
 * @author dancye
 * @modifier Hasini
 * @studentName 991641886
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        boolean luck = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int value = (int)(Math.random()*13 + 1);
            c.setValue(value);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suitnum = (int)(Math.random()*4);
            c.setSuit(Card.SUITS[suitnum]);
            // add c to your magicHand
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card luckyCard = new Card();
  
        luckyCard.setValue(8);
        luckyCard.setSuit(Card.SUITS[1]);
                   
        System.out.println("Lucky Card card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        // and search magicHand here
        for (int i=0; i< magicHand.length; i++){
            if(magicHand[i].getValue()== luckyCard.getValue() && magicHand[i].getSuit()==luckyCard.getSuit()){
                luck = true;
            }
        }
                
        //Then report the result here
        if (luck == true){
            System.out.println("Congratulations!!! Lucky Card is in the Magic Hand");
        }else{
            System.out.println("Lucky Card is not in the Magic Hand");
        }
        
        System.out.println("---------Magic Hand------------");
        for (int i=0; i< magicHand.length; i++){
            System.out.println("Card " + (i+1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }   
    } 
}
