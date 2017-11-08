package main.java.TheCardGame;

//Initialisation=Constructeur
//Boucle de jeu
//Condition de fin de jeu


public class Game {
    private Deck deck;
    private Hand handA;
    private Hand handB;
    private Kingdom kingA;
    private Kingdom kingB;

    Game(){
        this.deck=new Deck();
        this.handA=new Hand(deck);
        this.handB=new Hand(deck);
        this.kingA=new Kingdom();
        this.kingB=new Kingdom();
    }

    public String play(){
        //Loop for the game
        while(!this.End())
        {
            //code game
        }

        //Last Turn
        if(handA.isEmpty())
        {
            //last turn player B
        }
        else
        {
            //last turn player A
        }

        //Return name of winner
        String winName=this.isWinner(kingA,kingB);
        return winName;
    }

    public boolean End()
    {
        if(handA.isEmpty() || handB.isEmpty())
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
