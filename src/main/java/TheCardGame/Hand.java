package main.java.TheCardGame;
import java.util.ArrayList;
import java.util.List;

//Une main est une liste de cartes. On pioche 5 fois au départ.

public class Hand extends CardList {
    private List<Card> hand;
    public Hand(Deck deck){
        this.hand= new ArrayList<Card>();
        for(int start=0;start<5;start++)
        {
            this.Draw(deck);
        }
    }


    public void Draw(Deck deck){
        this.hand.add(deck.revealCard(42)); //Le 42 sert à rien, on remove toujours la première carte :)
        deck.remove(42);
    }

    public void Play(Kingdom kingdom, int a){
        kingdom.Add(hand.get(a));
        hand.remove(a);
    }

    public void Remove(int i){this.hand.remove(i);}

    public void Add(Card card){this.hand.add(card);}
    public int NbOfCards(){return this.hand.size();}
    public void change(List<Card> list){this.hand=list;}
    public List<Card> getList(){return this.hand;}
    public Card revealCard(int i){return this.hand.get(i);}
    public void remove(int i){this.hand.remove(i);}
    public boolean isEmpty(){
        if(this.NbOfCards()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
