package main.java.TheCardGame;

//Simple classe mère des cartes impléementant l'interface effet pour l'effet de la carte Elf

abstract class Card {
    private int ID;
    protected String race;

    Card(int ID){
        this.ID=ID;
        this.race="";
    }

    int getID(){return this.ID;}
    String getRace(){return race;}
    void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB, int place){}

}
