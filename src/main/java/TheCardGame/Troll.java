package main.java.TheCardGame;

//Le Troll échange les royaumes.

public class Troll extends Card implements Effect{
    public Troll(String Race){super(Race);}

    public void effect(Deck deckA,Deck deckB,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place){
        Kingdom kingC= new Kingdom();
        kingC.change(kingA.getList());
        kingA.change(kingB.getList());
        kingB.change(kingC.getList());
    }
}
