package main.java.TheCardGame;

//A REVOIR ABSOLUMENT!!!! DEMANDER A LA PROF QUE EFFECT DE LA CARTE DU KING B UTILISE LA METHODE DE LA SOUS CLASSE
//Car le pouvoir des elfes est d'utiliser l'effet d'un monstre ennemi sur le royaume. S'il n'y a pas de monstre, raté

public class Elf extends Card implements Effect {
    public Elf(int ID){super(ID);}

    public void effect(Deck deck,Kingdom kingA, Kingdom kingB,Hand handA,Hand handB,int place){
        if (kingB.NbOfCards()>=place+1){
            kingB.revealCard(place).effect(deck,kingA,kingB,handA,handB,place);
        }
    }
}
