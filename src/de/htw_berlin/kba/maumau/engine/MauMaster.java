package de.htw_berlin.kba.maumau.engine;

import de.htw_berlin.kba.maumau.model.Stack;


public interface MauMaster {

    Stack initDeck(Stack stack);

    Stack shuffleDeck(Stack stack);

}
