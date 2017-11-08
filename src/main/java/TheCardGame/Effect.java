package main.java.TheCardGame;

//Cette interface généralise la méthode effet car chaque carte POSSEDE un effet et est DIFFERENT

public interface Effect {
    void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place);
}
