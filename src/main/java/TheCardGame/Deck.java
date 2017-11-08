package main.java.TheCardGame;
import java.util.List;
import java.util.ArrayList;

//Un deck est une liste de carte, mais nous ne savons pas combien de carte il doit y avoir donc bon...

public class Deck extends CardList {
    private List<Card> deck;

    /*Créer une méthode de création de deck*/
    public Deck(){
        int ID=0;
        this.deck= new ArrayList<Card>();
        for(int i=0;i<5;i++){
            Dryad dryad=new Dryad(ID+1);
            this.Add(dryad);
            Elf elf=new Elf(ID+2);
            this.Add(elf);
            Gnome gnome=new Gnome(ID+3);
            this.Add(gnome);
            Goblin goblin=new Goblin(ID+4);
            this.Add(goblin);
            Korrigan korrigan=new Korrigan(ID+5);
            this.Add(korrigan);
            Troll troll=new Troll(ID+6);
            this.Add(troll);
            ID++;
        }
    }

    public List<Card> getDeck(){return this.deck;}

    public void change(List<Card> list){this.deck=list;}
    public int NbOfCards(){return deck.size();}
    public void Add(Card card){
        this.deck.add(card);
    }
    public List<Card> getList(){return this.deck;}
    public Card revealCard(int i){return this.deck.get(i);}
    public void remove(int i){this.deck.remove(i);}
}
