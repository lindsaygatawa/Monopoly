package upei.project;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        Strategy strategy1 = new Strategy(true,  true, false);
        Strategy strategy2 = new Strategy(false, false,true);

        Player player1 = new Player("Ayo",1, 1500, strategy1);
        Player player2 = new Player("Ben",2, 1500, strategy2);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game();

    }

    public static class Game {
    }
}