package upei.project;

import upei.project.ChanceCard;

import java.util.ArrayList;

public class ChanceClass {


// an array list containing all the chance card options available.
    ArrayList<ChanceCard> chanceCards = new ArrayList<>();

    // chance card options are being added to the array list
    public ChanceClass () {
        chanceCards.add(new ChanceCard("Advance to go, collect $200",1));
        chanceCards.add(new ChanceCard("Advance to mediterranean ave", 2));
        chanceCards.add(new ChanceCard("Bank pays you dividend of $50",-1,50));
        chanceCards.add(new ChanceCard("Advance to water works", 29));
        chanceCards.add(new ChanceCard("Go back atlantic ave", 27));
        chanceCards.add(new ChanceCard("Advance to the nearest rail road", 26));
        chanceCards.add(new ChanceCard("Get out of jail free card", 0));
        chanceCards.add(new ChanceCard("Take a total of $100 and split between players",0,100));
        chanceCards.add(new ChanceCard("Advance to st charles place", 12));
        chanceCards.add(new ChanceCard("Pay poor tax of $15",0,15));
        chanceCards.add(new ChanceCard("Pay each player $50", 0, 50));
        chanceCards.add(new ChanceCard("Your building and loan matures. collect $150", -1, 150));
        chanceCards.add(new ChanceCard("Advance to boardwalk", 40));
        chanceCards.add(new ChanceCard("Advance to indiana ave", 24));





    }
}



