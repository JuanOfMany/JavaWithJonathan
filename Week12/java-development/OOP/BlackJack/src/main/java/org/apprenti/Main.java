package org.apprenti;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Card> myCards = new ArrayList<Card>();
//
//        myCards.add(new Card( Suit.SPADES, Value.ACE));
//        myCards.add(new Card( Suit.HEARTS, Value.KING));
//        myCards.add(new Card( Suit.HEARTS, Value.THREE));
//        myCards.add(new Card( Suit.CLUBS, Value.ACE));

//        Hand myHand = new Hand(myCards);

//        System.out.print(myHand.getValue());

        Deck myDeck = new Deck();
        Hand myHand = new Hand();
//        myHand.draw(myDeck.deal());
        myDeck.shuffle();
//        myHand.draw(myDeck.deal());
//        System.out.println(myHand.getValue());
//        myHand.draw(myDeck.deal());
//        myHand.draw(myDeck.deal());
//        System.out.println(myHand.getValue());
//        System.out.println(myDeck.getDeckLength());

        Player juan = new Player();
        juan.draw(myDeck.deal());
        System.out.println(juan.getHand().getValue());
        juan.draw(myDeck.deal());
        System.out.println(juan.getHand().getValue());
        juan.showHand();

    }
}