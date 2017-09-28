package main.java.TheCardGame;

//A REVOIR ABSOLUMENT!!!! DEMANDER A LA PROF QUE EFFECT DE LA CARTE DU KING B UTILISE LA METHODE DE LA SOUS CLASSE
//Car le pouvoir des elfes est d'utiliser l'effet d'un monstre ennemi sur le royaume. S'il n'y a pas de monstre, raté

public class Elf extends Card implements Effect {
    public Elf(String Race){super(Race);}

    public void effect(Deck deckA,Deck deckB,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        if (kingB.NbOfCards()>=place+1){
            kingB.revealCard(place).effect(deckA,deckB,kingA,kingB,handA,handB,place);
        }
    }
}
