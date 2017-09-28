package main.java.TheCardGame;

//Simple classe mère des cartes impléementant l'interface effet pour l'effet de la carte Elf

abstract class Card implements Effect{
    private String Race;

    Card(String Race){this.Race=Race;}

    String getRace(){return this.Race;}
}
