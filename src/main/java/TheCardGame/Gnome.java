package main.java.TheCardGame;

//Les gnomes font piocher deux cartes

public class Gnome extends Card implements Effect {
    public Gnome(String Race){super(Race);}

    public void effect(Deck deckA,Deck deckB,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        handA.Draw(deckA);
        handA.Draw(deckA);
    }
}
