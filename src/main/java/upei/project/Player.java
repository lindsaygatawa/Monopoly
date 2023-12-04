package upei.project;

import java.util.ArrayList;

public class Player extends Game {
    public String playerName;
    public int playerId;

    public int currentMoney;
    // make it an arraylist
    ArrayList<String> propertiesOwned = new ArrayList<>();
    //ArrayList<String> mortgageProperties= new ArrayList<>();
    public int currentPosition = 1;
    public Strategy strategy;


    public Player(String name, int id, int money, Strategy strategy) {

        this.playerName = name;
        this.playerId = id;
        this.currentMoney = money;

        this.strategy = strategy;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public boolean makePurchase(int costOfPurchase) {

        if (currentMoney >= costOfPurchase) {
            currentMoney -= costOfPurchase;
            return true;
        }

        return false;
    }

    //public  void mortgageProperty() {
    //}

    public void acceptMoney(int money) {

        currentMoney += money;
    }

    public boolean payRent(int rent) {

        if (currentMoney >= rent) {
            currentMoney -= rent;
            return true;
        } else {
            return false;

            }
        }


    }


