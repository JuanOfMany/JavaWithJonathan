package org.apprenti;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        for (Value value: Value.values()) {
            for (Suit suit: Suit.values()){
                this.cards.add(new Card(suit, value));
            }
        }
    }
}
