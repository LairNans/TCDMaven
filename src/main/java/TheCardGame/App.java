package main.java.TheCardGame;

public class App
{
    public static void main( String[] args )
    {
        //Game game=new Game();
        //System.out.println(game.play());
        Dryad dryad1= new Dryad(45);
        System.out.println(dryad1.getID());
        Deck deck= new Deck();
        for(int pataplop=0;pataplop<30;pataplop++)
        {
            System.out.println(deck.getList().get(pataplop).getRace());
        }
    }
}
