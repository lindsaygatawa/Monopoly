package upei.project;
import upei.project.Actions;
import upei.project.Player;
import java.util.ArrayList;
import java.util.Random;
import upei.project.ChanceClass;


public class Game {
    ArrayList<Player> players = new ArrayList<>();
    public ChanceClass chanceClass = new ChanceClass();
    public CommunityChest community = new CommunityChest();
    public boolean gameOver;



    Player winner;
    int numberOfPlayers;
    Random random = new Random();
    int randomIndex = random.nextInt( chanceClass.chanceCards.size());
    int randomIndex2 = random.nextInt( community.communityChestCards.size());

    //default constructor
    public Game(){

    }
    public Game(ArrayList<Player> p_Players) {

            this.players.addAll(p_Players);
            this.numberOfPlayers = players.size();
            Actions act = new Actions();


        }
        //game starts
        public Object startGame() {

            while (!gameOver) {


                for (int playerIndex = 0; playerIndex < numberOfPlayers; playerIndex++) {
                    Player player = players.get(playerIndex);


                    Actions roll = new Actions();
                    roll.rollDiceAndPrintTotal();

                    roll.moveForward(player);

                    int l_currentPosition = player.currentPosition;
                    System.out.println(l_currentPosition);

                    NewBox currentB = roll.newBoxes[l_currentPosition - 1];
                    System.out.println(currentB.boxType);
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
                                        System.out.println("INSUFFICIENT FUNDS");
                                    }
                                } else {
                                    System.out.println("not your strategy");
                                }
                            }


                            else if  (currentB.color.equals("Light blue")) {
                                    if (player.strategy.shouldPurchaseLightBlueLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    }
                                }

                                else if (currentB.color.equals("Brown")) {
                                    if (player.strategy.shouldPurchaseBrownLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("Not your strategy");
                                    }
                                }

                                if (currentB.color.equals("Pink")) {
                                    if (player.strategy.shouldPurchasePinkLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("Not your strategy");
                                    }
                                }

                                if (currentB.color.equals("Green")) {
                                    if (player.strategy.shouldPurchaseGreenLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("Not your strategy");
                                    }
                                }

                                if (currentB.color.equals("Orange")) {
                                    if (player.strategy.shouldPurchaseOrangeLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("Not your strategy");
                                    }
                                }

                                if (currentB.color.equals("Red")) {
                                    if (player.strategy.shouldPurchaseRedLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("Not your strategy");
                                    }
                                }

                                if (currentB.color.equals("Yellow")) {
                                    if (player.strategy.shouldPurchaseYellowLand) {
                                        boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                        if (canPurchase) {
                                            currentB.setOwnedBy(player);
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("not your strategy");
                                    }
                                } else {
                                    System.out.println("Not a valid box");
                                }
                            }
                            else if (owner != player) {
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    System.out.println("Rent paid");
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                System.out.println("Current player owns box");
                            }
                        }
                    else if (currentB.boxType.equals("Utility")) {
                        if (currentB.boxName.equals("Railroad")) {
                            Player owner = currentB.getOwnedBy();
                            if (owner == null) {
                                if (player.strategy.shouldPurchaseRailway) {
                                    boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                    if (canPurchase) {
                                        currentB.setOwnedBy(player);
                                    } else {
                                        System.out.println("INSUFFICIENT FUNDS");
                                    }
                                } else {
                                    System.out.println("not your strategy");
                                }
                            }
                            else if (owner != player) {
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    System.out.println("rent paid");
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                System.out.println("current player owns box");
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
                                        System.out.println("INSUFFICIENT FUNDS");
                                    }
                                } else {
                                    System.out.println("not your strategy");
                                }
                            }
                            else if (owner != player) {
                                boolean l_payRent = player.payRent(currentB.rent);
                                if (l_payRent) {
                                    System.out.println("Rent paid");
                                } else {
                                    players.remove(player);
                                }
                                owner.acceptMoney(currentB.rent);
                            } else {
                                System.out.println("current player owns box");
                            }
                        }
                    }
                    else if (currentB.boxName.equals("Electric company")) {
                        Player owner = currentB.getOwnedBy();
                        if (owner == null) {
                            if (player.strategy.shouldPurchaseElectricCompany) {
                                boolean canPurchase = player.makePurchase(currentB.boxPrice);
                                if (canPurchase) {
                                    currentB.setOwnedBy(player);
                                } else {
                                    System.out.println("INSUFFICIENT FUNDS");
                                }
                            } else {
                                System.out.println("Not your strategy");
                            }
                        }
                        else if (owner != player ) {
                            boolean l_payRent = player.payRent(currentB.rent);
                            if (l_payRent) {
                                System.out.println("INSUFFICIENT FUNDS");
                            } else {
                                players.remove(player);
                            }
                            owner.acceptMoney(currentB.rent);
                        } else {
                            System.out.println("Current player owns box");
                        }
                    }
                    else if (currentB.boxType.equals("Tax")) {
                        boolean l_payRent = player.payRent(currentB.rent);
                        if (l_payRent) {
                            System.out.println("rent paid");
                        } else {
                            players.remove(player);
                        }

                    }
                    else if (currentB.boxType.equals("Chance")) {
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
                    else if (currentB.boxType.equals("Community chest box")) {
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
                    else if (currentB.boxType.equals("No actions")) {
                        if (currentB.boxName.equals("Go to Jail")) {
                            roll.GoToJail(player, currentB);
                        }
                        if (currentB.boxId == 21) {
                            System.out.println("Enjoy your free parking");
                        }
                        else if (currentB.boxName.equals("Jail")){
                            System.out.println("Enjoy your jail time");

                        }else {
                            System.out.println("YOU JUST PASSED GO");
                        }

                    } else {
                        System.out.println("NOT A VALID BOX TYPE");
                    }





                }


                if (players.size() == 1) {
                    gameOver = true;
                    winner = players.get(0);
                    break; // Exit the loop
                }
            }

            if (gameOver) {
                return "The winner is " + winner;
            } else {
                return "";

        }







}}