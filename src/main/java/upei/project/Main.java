package upei.project;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        Strategy strategy1 = new Strategy(true,  true, false,false,false, true,true,true,false,true,true);
        Strategy strategy2 = new Strategy(false, false,true,true,true,false,false,false,true,false,false);
        Strategy strategy3 = new Strategy(true,true,true,true,true,true,true,true,true,true,true);

        Player player1 = new Player("Ayo",1, 1500, strategy1);
        Player player2 = new Player("Ben",2, 1500, strategy2);
        Player player3 = new Player("Jay",3,1500,strategy3);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game();

    }

    public static class Game {
    }
}