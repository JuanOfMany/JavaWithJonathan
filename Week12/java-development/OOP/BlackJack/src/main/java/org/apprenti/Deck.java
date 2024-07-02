package org.apprenti;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        for (Value value: Value.values()) {
            for (Suit suit: Suit.values()){
                if (suit != Suit.NULL && value != Value.NULL){
                    this.cards.add(new Card(suit, value));
                }
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card deal(){
        return this.cards.remove(0);
    }

    public int getDeckLength() {
        return this.cards.size();
    }
}
