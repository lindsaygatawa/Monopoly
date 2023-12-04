package upei.project;
import upei.project.Actions;
import upei.project.Player;
import java.util.ArrayList;



public class Game {
    ArrayList<Player> players = new ArrayList<>();
    public ChanceClass chanceClass;
    String winner;
    int numberOfPlayers = 2;

    //default constructor
    public Game(){

    }
    public Game(ArrayList<Player> p_Players) {
            this.numberOfPlayers = p_Players.size();

            this.players.addAll(p_Players);
            Actions act = new Actions();
            act.createBoxes();

        }
        //game starts
        public Object startGame() {
            for (int playerIndex = 0;  playerIndex< players.size(); playerIndex++) {
                Player player = players.get(playerIndex);

                Actions roll = new Actions();
                roll.rollDiceAndPrintTotal();

                roll.moveForward(player);

                int l_currentPosition = player.currentPosition;
                NewBox currentB = roll.newBoxes[l_currentPosition - 1];
                if (currentB.boxType.equals("land") ){

                    Player owner = currentB.getOwnedBy();
                    if (owner == null) {
                        player.makePurchase(currentB.boxPrice);

                        if (currentB.color.equals("light blue")) {
                            if (player.strategy.shouldPurchaseBlueLand) {
                                boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                if (canPurchase) {
                                    currentB.setOwnedBy(player);
                                } else {
                                    return "INSUFFICIENT FUNDS";
                                }
                            } else {
                                return "not your strategy";
                            }

                            if (currentB.color.equals("dark blue")) {
                                if (player.strategy.shouldPurchaseLightBlueLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("pink")) {
                                if (player.strategy.shouldPurchaseBrownLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("brown")) {
                                if (player.strategy.shouldPurchasePinkLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("Red")) {
                                if (player.strategy.shouldPurchaseGreenLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("Yellow")) {
                                if (player.strategy.shouldPurchaseOrangeLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("Orange")) {
                                if (player.strategy.shouldPurchaseRedLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            }

                            if (currentB.color.equals("brown")) {
                                if (player.strategy.shouldPurchaseYellowLand) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        return "INSUFFICIENT FUNDS";
                                    }
                                } else {
                                    return "not your strategy";
                                }
                            } else {
                                return "not a valid land box";
                            }
                        }
                        if (owner != player) {
                            player.payRent(currentB.rent);
                            return "rent paid";

                        } else {
                            return "current player owns box";
                        }
                    }


                }
                if (currentB.boxType.equals("Community chest box")){

                }
                if (currentB.boxType.equals("Chance")){

                }
                if (currentB.boxType.equals("Utility")){

                }
                if (currentB.boxType.equals("No actions")){
                }




















            }
        }









}}