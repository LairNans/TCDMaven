package main.java.TheCardGame;

//Simple classe mère des cartes impléementant l'interface effet pour l'effet de la carte Elf

abstract class Card implements Effect{
    private int ID;

    Card(int ID){this.ID=ID;}

    int getID(){return this.ID;}
}
