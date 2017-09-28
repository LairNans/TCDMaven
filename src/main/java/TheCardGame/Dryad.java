package main.java.TheCardGame;

//La dryade vole une carte du royaume en face (B) pour son royaume (A)

public class Dryad extends Card implements Effect {
    public Dryad(String Race){super(Race);}

    public void effect(Deck deckA,Deck deckB,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        kingA.Add(kingB.revealCard(place));
    }
}
