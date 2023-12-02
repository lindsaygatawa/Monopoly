package upei.project;

import upei.project.Actions;
import upei.project.Player;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    //public ChanceClass chanceClass;


    public Player currentPlayer = players.get(0);

    int numberOfPlayers = 2;


    public Game(ArrayList<Player> p_Players) {
            this.numberOfPlayers = p_Players.size();

            this.players.addAll(p_Players);
            Actions act = new Actions();
            act.createBoxes();
            ChanceClass chanceClass;
        }

        public void startGame() {
            for (int playerIndex = 0;  playerIndex< players.size(); playerIndex++) {
                Player player = players.get(playerIndex);

                LandBox box = new LandBox("", 1, 2, 0, 300,"blue");

                if(box.color == "blue") {
                    if(player.strategy.shouldPurchaseBlueLand == true) {

                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if(canPurchase)
                            box.setOwnedBy(player);


                    }
                }
                else if(box.color == "red") {

                }

//                moveForward(player);

            }
        }






        public Player getcurrentPlayer () {
            return this.currentPlayer;
        }


}