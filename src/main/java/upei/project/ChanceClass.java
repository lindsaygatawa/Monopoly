package upei.project;

import upei.project.ChanceCard;

import java.util.ArrayList;

public class ChanceClass {


// an array list containing all the chance card options available.
    ArrayList<ChanceCard> chanceCards = new ArrayList<>();

    // chance card options are being added to the array list
    public ChanceClass () {
        chanceCards.add(new ChanceCard("Advance to go, collect $200"));
        chanceCards.add(new ChanceCard("Advance to illinois ave"));
        chanceCards.add(new ChanceCard("Go back three spaces"));
        chanceCards.add(new ChanceCard("Bank pays you dividend of $50"));
        chanceCards.add(new ChanceCard("Advance to the nearest utility"));
        chanceCards.add(new ChanceCard("Go back three spaces"));
        chanceCards.add(new ChanceCard("Advance to the nearest rail road"));
        chanceCards.add(new ChanceCard("Get out of jail free card"));
        chanceCards.add(new ChanceCard("Take a total of $100 and split between players"));
        chanceCards.add(new ChanceCard("Advance to st charles place"));
        chanceCards.add(new ChanceCard("Pay poor tax of $15"));
        chanceCards.add(new ChanceCard("Pay each player $50"));
        chanceCards.add(new ChanceCard("Your building and loan matures. collect $150"));
        chanceCards.add(new ChanceCard("advance to boardwalk"));
        chanceCards.add(new ChanceCard("advance to go"));





    }
}



