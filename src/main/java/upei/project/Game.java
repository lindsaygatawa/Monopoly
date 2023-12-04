package upei.project;
import upei.project.Actions;
import upei.project.Player;
import java.util.ArrayList;
import java.util.Random;
import upei.project.ChanceClass;


public class Game {
    ArrayList<Player> players = new ArrayList<>();
    public ChanceClass chanceClass;
    public CommunityChest community;
    Player winner;
    int numberOfPlayers;
    Random random = new Random();
    int randomIndex = random.nextInt( chanceClass.chanceCards.size());
    int randomIndex2 = random.nextInt( community.communityChestCards.size());

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

            do {


                for (int playerIndex = 0; playerIndex < players.size(); playerIndex++) {
                    Player player = players.get(playerIndex);


                    Actions roll = new Actions();
                    roll.rollDiceAndPrintTotal();

                    roll.moveForward(player);

                    int l_currentPosition = player.currentPosition;
                    NewBox currentB = roll.newBoxes[l_currentPosition - 1];
                    if (currentB.boxType.equals("land")) {

                        Player owner = currentB.getOwnedBy();
                        if (owner == null) {
                            player.makePurchase(currentB.boxPrice);

                            if (currentB.color.equals("Dark Blue")) {
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

                                if (currentB.color.equals("Light blue")) {
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

                                if (currentB.color.equals("Brown")) {
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

                                if (currentB.color.equals("Pink")) {
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

                                if (currentB.color.equals("Green")) {
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

                                if (currentB.color.equals("Orange")) {
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

                                if (currentB.color.equals("Red")) {
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

                                if (currentB.color.equals("Yellow")) {
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
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    return "rent paid";
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                return "current player owns box";
                            }
                        }
                    }


                    if (currentB.boxType.equals("Utility")) {
                        if (currentB.boxName.equals("Railroad")) {
                            Player owner = currentB.getOwnedBy();
                            if (owner == null) {
                                if (player.strategy.shouldPurchaseRailway) {
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
                            if (owner != player) {
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    return "rent paid";
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                return "current player owns box";
                            }
                        }


                        if (currentB.boxName.equals("Water work")) {
                            Player owner = currentB.getOwnedBy();
                            if (owner == null) {
                                if (player.strategy.shouldPurchaseWaterWorks) {
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
                            if (owner != player) {
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    return "rent paid";
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                return "current player owns box";
                            }
                        }
                    }


                    if (currentB.boxName.equals("Electric company")) {
                        Player owner = currentB.getOwnedBy();
                        if (owner == null) {
                            if (player.strategy.shouldPurchaseElectricCompany) {
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
                        if (owner != player) {
                            boolean l_payRent = player.payRent(currentB.rent);
                            if (l_payRent) {
                                return "rent paid";
                            } else {
                                players.remove(player);
                            }
                            owner.acceptMoney(currentB.rent);
                        } else {
                            return "current player owns box";
                        }
                    }


                    if (currentB.boxType.equals("Tax")) {
                        boolean l_payRent = player.payRent(currentB.rent);
                        if (l_payRent) {
                            return "rent paid";
                        } else {
                            players.remove(player);
                        }

                    }


                    if (currentB.boxType.equals("Chance")) {
                        ChanceCard randomCard = chanceClass.chanceCards.get(randomIndex);
                        if (randomCard.boxId < 0){
                            roll.advanceTo(player,randomCard);
                        }
                        if(randomCard.boxId == -1) {
                            player.acceptMoney(randomCard.cardPrice);
                        }
                        if (randomCard.boxId == 0){
                            player.makePurchase(randomCard.cardPrice);
                        }

                    }


                    if (currentB.boxType.equals("Community chest box")) {
                        CommunityChestCard randomCard = community.communityChestCards.get(randomIndex2);
                        if (randomCard.boxID < 0){
                            roll.advanceTo(player,randomCard);
                        }
                        if(randomCard.boxID == -1) {
                            player.acceptMoney(randomCard.cardPrice);
                        }
                        if (randomCard.boxID == 0){
                            player.makePurchase(randomCard.cardPrice);
                        }

                    }


                    if (currentB.boxType.equals("No actions")) {
                        if (currentB.boxName.equals("Go to Jail")) {
                            roll.GoToJail(player, currentB);
                        }
                        if (currentB.boxId == 21) {
                            return "Enjoy your free parking";
                        } else {
                            return "You just passed GO";
                        }

                    } else {
                        return "not a box type";
                    }


                }
                if (players.size() == 1) {
                    winner = players.get(0);
                } else {
                    return "";
                }
                return "The winner is" + winner;
            }
            while (winner == null);

        }







}