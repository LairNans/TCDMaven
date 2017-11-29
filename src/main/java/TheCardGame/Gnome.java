package main.java.TheCardGame;

//Les gnomes font piocher deux cartes

public class Gnome extends Card{
    public Gnome(int ID){
        super(ID);
        this.race="Gnome";
    }

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        handA.Draw(deck);
        handA.Draw(deck);
    }
}
