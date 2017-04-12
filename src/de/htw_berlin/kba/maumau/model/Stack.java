package de.htw_berlin.kba.maumau.model;

import java.util.LinkedList;

public class Stack {

    LinkedList<Card> deck = new LinkedList<>();

    public Stack() {

    }

    public LinkedList<Card> getDeck() {
        return deck;
    }

    public void setDeck(LinkedList<Card> deck) {
        this.deck = deck;
    }

    public int amountOfCards() {
        return deck.size();
    }

}