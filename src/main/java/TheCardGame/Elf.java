package main.java.TheCardGame;

public class Elf extends Card{
    public Elf(int ID){
        super(ID);
        this.race="Elf";
    }

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        if (kingB.NbOfCards()>=place+1){
            kingB.revealCard(place).effect(deck,kingA,kingB,handA,handB,place);
        }
    }
}
