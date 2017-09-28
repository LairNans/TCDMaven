package main.java.TheCardGame;
import java.util.List;
import java.util.ArrayList;

//Un deck est une liste de carte, mais nous ne savons pas combien de carte il doit y avoir donc bon...

public class Deck implements CardList {
    private List<Card> deck;
    private int drawPlace=0;
    /*Créer une méthode de création de deck*/
    public Deck(){
        this.deck= new ArrayList<Card>();
    }

    public List<Card> getDeck(){return this.deck;}

    public void change(List<Card> list){this.deck=list;}
    public int NbOfCards(){return deck.size();}
    public void Add(Card card){
        this.deck.add(card);
    }
    public List<Card> getList(){return this.deck;}
    public Card revealCard(int i){return this.deck.get(drawPlace);}
    public void remove(int i){this.deck.remove(i);}
}
