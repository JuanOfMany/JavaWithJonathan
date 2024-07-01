package org.apprenti;

import java.util.HashMap;

public class Card {
    private final Suit suit;
    private final Value value;
    private Boolean isFaceUp;
    HashMap<Value, Integer> map = new HashMap<>();

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = true;

        map.put(Value.NULL, 0);
        map.put(Value.ACE, 11);
        map.put(Value.TWO, 2);
        map.put(Value.THREE, 3);
        map.put(Value.FOUR, 4);
        map.put(Value.FIVE, 5);
        map.put(Value.SIX, 6);
        map.put(Value.SEVEN, 7);
        map.put(Value.EIGHT, 8);
        map.put(Value.NINE, 9);
        map.put(Value.TEN, 10);
        map.put(Value.JACK, 10);
        map.put(Value.QUEEN, 10);
        map.put(Value.KING, 10);
    }

    public Suit getSuit() {
        return this.isFaceUp() ? this.suit : Suit.NULL;
    }

    public Value getValue() {
        return this.isFaceUp() ? this.value : Value.NULL;
    }

    public Boolean isFaceUp() {
        return this.isFaceUp;
    }

    public Boolean flip() {
        this.isFaceUp = !this.isFaceUp;
        return this.isFaceUp;
    }

    public int getPointValue() {
        return this.map.get(this.getValue());
    }
}
