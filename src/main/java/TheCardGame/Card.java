package main.java.TheCardGame;

abstract class Card {
    private String Race;

    Card(String Race){this.Race=Race;}

    String getRace(){return this.Race;}
}
