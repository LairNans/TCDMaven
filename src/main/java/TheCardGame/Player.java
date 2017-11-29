package main.java.TheCardGame;


public class Player {
    private Kingdom king;
    private Hand hand;
    private int nb;

    Player(int nb, Deck deck){
        this.king=new Kingdom();
        this.hand= new Hand(deck);
        this.nb=nb;
    }

    Kingdom getKingdom(){return this.king;}
    Hand getHand(){return this.hand;}
    int getNb(){return this.nb;}
}
