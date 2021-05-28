package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 *
 * @ModifiedBy Chris Klammer (Christopher Sean Andrew Klammer 991607036)
 */
public class CardTrick
{

    public static void main (String[] args)
    {
        // Declare variables
        Scanner inKeys = new Scanner(System.in);
        String userGuess = "";
        int guessedValue = 0;
        String guessedSuit = "";
        boolean acceptableInput = true;
        boolean guessWin = false;

        // Create Magic Hand of 7 cards; populate cards with values
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (1 + Math.random() * 13));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        // Add hard-coded "Lucky Card"; 7 of Spades
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(7);

        /* COMMENTING OUT USER INPUT SECTION IN FAVOUR OF HARD CODED LUCKY CARD
         * //insert code to ask the user for Card value and suit, create their
         * card
         * System.out.println("Guess a card, any card! (from a standard deck)");
         * do {
         * acceptableInput = true; // Reset for multiple attempts
         * System.out.println("Guess card value (1 ~ 13); [A]ce = 1, "
         * + "[J]ack = 11, [Q]ueen = 12, [K]ing = 13.");
         * userGuess = inKeys.next();
         * inKeys.nextLine(); // purge input buffer
         *
         * // check user input: If numerals; else if jack/queen/king/ace
         * if (userGuess.matches("[1-9]") || userGuess.matches("1[0-3]")) {
         * guessedValue = Integer.parseInt(userGuess);
         * }
         * else {
         *
         * // Allows word entry.
         * userGuess = userGuess.toUpperCase();
         * switch (userGuess.charAt(0)) {
         * case 'J':
         * guessedValue = 11;
         * break;
         * case 'Q':
         * guessedValue = 12;
         * break;
         * case 'K':
         * guessedValue = 13;
         * break;
         * case 'A':
         * guessedValue = 1;
         * break;
         * default:
         * acceptableInput = false;
         * }
         * }
         * }
         * while (acceptableInput == false);
         *
         * // Request suit selection
         * do {
         * acceptableInput = true; // Reset for multiple attempts
         * System.out.println("Enter a suit. ([H]earts, [D]iamonds, [C]lubs, "
         * + "or [S]pades)");
         * userGuess = inKeys.next().toUpperCase();
         * inKeys.nextLine(); // purge input buffer
         *
         * // accept any input beginning with H, D, C, or S
         * switch (userGuess.charAt(0)) {
         * case 'H':
         * guessedSuit = "Hearts";
         * break;
         * case 'D':
         * guessedSuit = "Diamonds";
         * break;
         * case 'S':
         * guessedSuit = "Spades";
         * break;
         * case 'C':
         * guessedSuit = "Clubs";
         * break;
         * default:
         * acceptableInput = false;
         * System.out.println("Please enter only an acceptable suit.");
         * }
         * }
         * while (acceptableInput == false);
         * */

        // manually set guessedValue and guessedSuit variables to luckyCard info
        guessedValue = luckyCard.getValue();
        guessedSuit = luckyCard.getSuit();

        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if (guessedValue == magicHand[i].getValue()
                && guessedSuit == magicHand[i].getSuit()) {
                guessWin = true;
            }
        }

        //Then report the result here
        if (guessWin) {
            System.out.println("Wow!  You got a match in the Magic Hand!");
        }
        else {
            System.out.println("Sorry, no match in the Magic Hand...");
        }
    }
}
