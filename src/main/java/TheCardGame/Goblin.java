package main.java.TheCardGame;

//Les gobelins font swap les mains.

public class Goblin extends Card implements Effect {
    public Goblin(int ID){super(ID);}

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place){
        Deck deckC=new Deck();
        Hand handC= new Hand(deckC); //Obligé de mettre un deck mais celui-ci sera remplacé de toute manière
        handC.change(handA.getList());
        handA.change(handB.getList());
        handB.change(handC.getList());
    }
}
