package main.java.TheCardGame;
import java.util.List;
import java.util.ArrayList;

//Le royaume est le plateau de jeu du joueur. Vide au départ, on rajoute des cartes a chaque tour.
public class Kingdom implements CardList{
    private List<Card> kingdom;
     public Kingdom(){
         this.kingdom= new ArrayList<Card>();
     }

     public void Add(Card card){this.kingdom.add(card);}
     public int NbOfCards(){return kingdom.size();}
     public void change(List<Card> list){this.kingdom=list;}
     public List<Card> getList(){return this.kingdom;}
     public Card revealCard(int i){return this.kingdom.get(i);}
     public void remove(int i) {this.kingdom.remove(i);}
}
