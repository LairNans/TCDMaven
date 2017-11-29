package main.java.TheCardGame;

//La dryade vole une carte du royaume en face (B) pour son royaume (A)

public class Dryad extends Card{
    public Dryad(int ID){
        super(ID);
        this.race="Dryad";
    }

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        kingA.Add(kingB.revealCard(place));
    }
}
