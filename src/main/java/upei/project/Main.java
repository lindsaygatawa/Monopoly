package upei.project;
import upei.project.Game;
import java.util.ArrayList;


public class Main {
    ArrayList<Player> winners = new ArrayList<>();


    public static void  main(String[] args) {

        Strategy strategy1 = new Strategy(true,  true, false,false,false, true,true,true,false,true,true);
        Strategy strategy2 = new Strategy(false, false,true,true,true,false,false,false,true,false,false);
        Strategy strategy3 = new Strategy(true,true,true,true,true,true,true,true,true,true,true);

        Player player1 = new Player("Ayo",1, 1500, strategy1);
        Player player2 = new Player("Ben",2, 1500, strategy2);
        Player player3 = new Player("Jay",3,1500,strategy3);
        Player player4 = new Player("Mike",4,1500,strategy1);



        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(players);
        game.startGame();





        ArrayList<Player> players2 = new ArrayList<>();
        players2.add(player1);
        players2.add(player2);
        players2.add(player3);

        Game game2 = new Game(players2);

        game2.startGame();


        ArrayList<Player> players3 = new ArrayList<>();
        players3.add(player1);
        players3.add(player4);
        players3.add(player3);


        Game game3 = new Game(players3);
        game3.startGame();

    }



}