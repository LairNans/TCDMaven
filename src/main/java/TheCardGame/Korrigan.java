package main.java.TheCardGame;
import java.util.Random;

//Le korrigan vole deux cartes ALEATOIRES dans la main adverse.

public class Korrigan extends Card{
    public Korrigan(int ID){
        super(ID);
        this.race="Korrigan";
    }

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place){
        Random rando1= new Random();
        Random rando2= new Random();

        int rand1 = rando1.nextInt(handB.NbOfCards())+1;
        handA.Add(handB.revealCard(rand1));
        handB.Remove(rand1);

        int rand2 = rando2.nextInt(handB.NbOfCards())+1;
        handA.Add(handB.revealCard(rand2));
        handB.Remove(rand2);
    }
}
