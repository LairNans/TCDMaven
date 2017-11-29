package main.java.TheCardGame;

//Initialisation=Constructeur
//Boucle de jeu
//Condition de fin de jeu


public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    Game(){
        this.deck=new Deck();
        this.player1=new Player(1,deck);
        this.player2=new Player(2,deck);
    }

    public String play(){
        //Loop for the game
        while(!this.End())
        {
            //code game
        }

        //Last Turn
        if(player1.getHand().isEmpty())
        {
            //last turn player B
        }
        else
        {
            //last turn player A
        }

        //Return name of winner
        String winName=this.isWinner(player1.getKingdom(),player2.getKingdom());
        return winName;
    }

    public boolean End()
    {
        if(player1.getHand().isEmpty() || player2.getHand().isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String isWinner(Kingdom kingA, Kingdom kingB)
    {
        int pointsA=0;
        int pointsB=0;

        //Count points.
        pointsA+=kingA.NbOfCards();
        pointsB+=kingB.NbOfCards();
        if(kingA.gotAllRaces()){pointsA+=3;}
        if(kingB.gotAllRaces()){pointsB+=3;}

        //Final Call
        if(pointsA<pointsB)
        {
            return "Player B won !";
        }
        else
        {
            if(pointsA>pointsB)
            {
                return "Player A won !";
            }
            else
            {
                return "It's a draw...";
            }
        }
    }
}
