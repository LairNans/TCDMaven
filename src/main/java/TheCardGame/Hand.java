package main.java.TheCardGame;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand;
    public Hand(){
        this.hand= new ArrayList<Card>();
    }

    public void Draw(Deck deck){
        List<Card> list =deck.getDeck();
        Card card= list.get(0);
        list.remove(0);
        deck.ChangeDeck(list);
        this.hand.add(card);
    }

    public void Play(Kingdom kingdom, int a){
        kingdom.Add(hand.get(a));
        hand.remove(a);
    }
}
