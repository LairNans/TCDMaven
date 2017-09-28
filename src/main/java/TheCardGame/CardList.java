package main.java.TheCardGame;
import java.util.List;

//Cette interface facilite l'utilisation du deck, de la main et du royaume, tous possédant des listes de cartes

public interface CardList {
    int NbOfCards();
    void Add(Card card);
    void remove(int i);
    void change(List<Card> list);
    List<Card> getList();
    Card revealCard(int i);
}
