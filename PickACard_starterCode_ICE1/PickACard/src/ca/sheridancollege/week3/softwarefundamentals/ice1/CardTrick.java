/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(ThreadLocalRandom.current().nextInt(1,14));
            c.setSuit(Card.SUITS[ThreadLocalRandom.current().nextInt(0,4)]);
        }
        
        System.out.println("Enter suit (Hearts, Diamonds, Spades, CLubs) : ");
        String suit = System.console().readLine();

        System.out.println("Enter card number (1-13) : ");
        int card = Integer.parseInt(System.console().readLine());

        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getSuit().equals(suit) && magicHand[i].getValue() == card){
                System.out.println("Card found in magic hand!!");
                return;
            }
        }
        System.out.println("Sorry card not in magic hand!!");
    }
    
}
