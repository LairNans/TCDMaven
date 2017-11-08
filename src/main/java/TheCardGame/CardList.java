package main.java.TheCardGame;
import java.util.List;
import java.util.ArrayList;

abstract class CardList {
    private List<Card> listCard;

    CardList(){
        listCard=new ArrayList<Card>();
    }

    int NbOfCards(){return 0;};
    void Add(Card card){};
    void remove(int i){};
    void change(List<Card> list){};
    List<Card> getList(){return listCard;};
    Card revealCard(int i){return listCard.get(0);};

}
