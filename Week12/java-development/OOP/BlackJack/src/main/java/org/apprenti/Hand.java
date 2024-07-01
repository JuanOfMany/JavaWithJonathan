package org.apprenti;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand {
    ArrayList<Card> cards;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    Card deal(Card card) {
        this.cards.add(card);
        return card;
    };

    int getSize() {
        return this.cards.size();
    }

    static class CardComparator implements Comparator<Card> {
        @Override
        public int compare(Card a, Card b) {
            return a.getPointValue() - b.getPointValue();
        }
    }


    public void printHand() {
        for (Card card: cards) {
            System.out.print(card.getValue() + ", ");
        }
    }

    int getValue() {
        int sum = 0;
        this.printHand();
        Collections.sort(cards, new CardComparator());
        for (Card card : cards) {
            if (card.getValue() == Value.ACE) {
                int valueToAdd = sum + 11 > 21 ? 1 : 11;
                sum += valueToAdd;
            } else {
                sum += card.getPointValue();
            }
        }
        return sum;
    }
}
