package main.java.TheCardGame;

import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> deck;
    /*Créer une méthode de création de deck*/
    public Deck(){
        this.deck= new ArrayList<Card>();
    }

    public List<Card> getDeck(){return this.deck;}

    public void ChangeDeck(List<Card> list){this.deck=list;}

    public void Add(Card card){
        this.deck.add(card);
    }
}
