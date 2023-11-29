package upei.project;

public class Dice implements DiceAPI {

    private static final int NUM_DICE = 2;

    private int[] dice = new int [NUM_DICE];

    //method that stimulates dice roll
    public void roll () {
        for (int i=0; i<NUM_DICE; i++) {
            dice[i] = 1 + (int)(Math.random() * 6);
        }
        return;
    }
    //returns the dice array that contains the values of the 2 dices
    public int[] getDice () {
        return dice;
    }

    public int getTotal () {
        return (dice[0] + dice[1]);
    }

    //checks if the values that come on the dice when player rolls are equal
    public boolean isDouble () {
        return dice[0] == dice[1];
    }

    public String toString () {
        return dice[0] + " " + dice[1];
    }

}