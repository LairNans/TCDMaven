package main.java.TheCardGame;

//Le Troll échange les royaumes.

public class Troll extends Card implements Effect{
    public Troll(int ID){super(ID);}

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place){
        Kingdom kingC= new Kingdom();
        kingC.change(kingA.getList());
        kingA.change(kingB.getList());
        kingB.change(kingC.getList());
    }
}
