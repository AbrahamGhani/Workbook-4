package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();  // give each player a new empty hand
    }
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore() {
        return hand.getValue();  // uses the Hand's method to compute score
    }

    public void takeCard(Card card) {
        hand.Deal(card);  // give the card to the player's hand
    }

    public void resetHand() {
        hand = new Hand();  // simply make a new hand for resetting game
    }

    public String getPlayerHand() {
        StringBuilder handDescription = new StringBuilder();
        for (Card card : getHand().getCards()) {
            card.flip();  // make sure it's face up
            handDescription.append(card.getValue()).append(" of ").append(card.getSuit()).append(", ");
            card.flip();  // flip it back if needed
        }
        return handDescription.toString();
    }
}
