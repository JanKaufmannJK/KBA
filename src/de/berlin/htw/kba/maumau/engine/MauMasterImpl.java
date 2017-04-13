package de.berlin.htw.kba.maumau.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.berlin.htw.kba.maumau.model.Card;
import de.berlin.htw.kba.maumau.model.Stack;


public class MauMasterImpl implements MauMaster {

    public MauMasterImpl(){}

    @Override
    public Stack initDeck(Stack stack)  {

        //auslagern als enum
        List<String> suits = new ArrayList<>(Arrays.asList("Herz", "Karo", "Kreuz", "Pik"));

        //auslagern als enum
        List<String> ranks = new ArrayList<>(Arrays.asList("7","8","9","10","Bube","Dame","König","Ass"));

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit,rank);
                stack.getDeck().add(card);
                System.out.println("Card " + card.getSuit() + "|" + card.getRank() + " zum Stack hinzugefügt...");
            }
        }
        return stack;
    }

    @Override
    public Stack shuffleDeck(Stack stack) {
        return stack;
    }

//    public Card getCardFromDeck() {
//        Card temp = this.deck.getFirst();
//        this.deck.remove(this.deck.getFirst());
//        return temp;
//    }
}
