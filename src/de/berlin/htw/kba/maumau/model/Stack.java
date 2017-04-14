package de.berlin.htw.kba.maumau.model;

import java.util.LinkedList;

public class Stack {

    private LinkedList<Card> deck = new LinkedList<>();

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

    public String getCardsOfDeck() {

        String temp = "";

        for (Card card : deck) {
            //System.out.println(card.getSuit());
            //System.out.println(card.getRank());
            temp = temp + card.getSuit() + "|" + card.getRank() + "\r\n";
        }

        return temp;
    }

}