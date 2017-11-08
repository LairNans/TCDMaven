package main.java.TheCardGame;

//La dryade vole une carte du royaume en face (B) pour son royaume (A)

public class Dryad extends Card implements Effect {
    public Dryad(int ID){super(ID);}

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        kingA.Add(kingB.revealCard(place));
    }
}
