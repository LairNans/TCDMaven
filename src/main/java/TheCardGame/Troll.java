package main.java.TheCardGame;

public class Troll extends Card{
    public Troll(String Race){super(Race);}

    void effect(Kingdom kingA, Kingdom kingB){
        Kingdom kingC= new Kingdom();
        kingC=kingA;
        kingA=kingB;
        kingB=kingC;
    }
}
