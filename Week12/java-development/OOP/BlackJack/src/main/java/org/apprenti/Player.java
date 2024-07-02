package org.apprenti;

public class Player {
    private Hand hand;
    private String name;

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Player(Hand hand) {
        setHand(hand);
    }

    public Player() {
        setHand(new Hand());
    }

    public void draw(Card card) {
        this.hand.draw(card);
    }

    public void showHand(){
        this.hand.printHand();
    }
}
