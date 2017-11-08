package main.java.TheCardGame;
import java.util.List;
import java.util.ArrayList;

//Le royaume est le plateau de jeu du joueur. Vide au départ, on rajoute des cartes a chaque tour.
public class Kingdom extends CardList{
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
     public boolean gotAllRaces(){
         int nbDryad=0;
         int nbElf=0;
         int nbGnome=0;
         int nbGoblin=0;
         int nbKorrigan=0;
         int nbTroll=0;
         for(int i=0;i<this.NbOfCards();i++)
         {
             if(this.revealCard(i)instanceof Elf) {nbElf++;}
             else
             {
                 if(this.revealCard(i)instanceof Dryad) {nbDryad++;}
                 else
                 {
                     if(this.revealCard(i)instanceof Gnome) {nbGnome++;}
                     else
                     {
                         if(this.revealCard(i)instanceof Goblin) {nbGoblin++;}
                         else
                         {
                             if(this.revealCard(i)instanceof Korrigan) {nbKorrigan++;}
                             else
                             {
                                 nbTroll++;
                             }
                         }
                     }
                 }
             }
         }
         if(nbDryad==0 || nbElf==0 || nbGnome==0 || nbGoblin==0 || nbKorrigan==0 || nbTroll==0)
         {
             return false;
         }
         return true;
     }
}
