package upei.project;

import upei.project.Actions;
import upei.project.Player;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    //public ChanceClass chanceClass;
    String winner;
    public Player currentPlayer = players.get(0);

    int numberOfPlayers = 2;

    //default constructor
    public Game(){

    }
    public Game(ArrayList<Player> p_Players) {
            this.numberOfPlayers = p_Players.size();

            this.players.addAll(p_Players);
            Actions act = new Actions();
            act.createBoxes();
            ChanceClass chanceClass;
        }
        //game starts
        public void startGame() {
            for (int playerIndex = 0;  playerIndex< players.size(); playerIndex++) {
                Player player = players.get(playerIndex);

                Actions roll = new Actions();
                roll.rollDiceAndPrintTotal();

                roll.moveForward(player);

                int currentP = player.currentPosition;
                NewBox currentB = roll.newBoxes[currentP - 1];
                if (currentB.boxType.equals("land") ){
                    LandBox curre
                    //LandBox owner = new LandBox;
                    LandBox

                    Player owner = currentB.getOwnedBy()
                }







                    if(box.color == "blue"){
                        if (player.strategy.shouldPurchaseBlueLand == true) {

                            boolean canPurchase = player.makePurchase(box.boxPrice);

                            if (canPurchase)
                                box.setOwnedBy(player);


                        }
                    } else if (box.color == "brown") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);
                    } else if (box.color == "lightBlue") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);

                    } else if (box.color == "Red") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);

                    } else if (box.color == "Yellow") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);

                    } else if (box.color == "Purple") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);
                    } else if (box.color == "Green") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);
                    } else if (box.color == "Orange") {
                        boolean canPurchase = player.makePurchase(box.boxPrice);

                        if (canPurchase)
                            box.setOwnedBy(player);

                    }








//


            }
        }






        public Player getcurrentPlayer () {
            return this.currentPlayer;
        }


}