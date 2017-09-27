package main.java.TheCardGame;

import java.util.List;
import java.util.ArrayList;

public class Kingdom {
    private List<Card> kingdom;
     public Kingdom(){
         this.kingdom= new ArrayList<Card>();
     }

     public void Add(Card card){
         this.kingdom.add(card);
     }
}
