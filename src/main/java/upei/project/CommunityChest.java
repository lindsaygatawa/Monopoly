package upei.project;

import java.util.ArrayList;

public class CommunityChest {
    ArrayList<CommunityChestCard> communityChestCards = new ArrayList<>();

    // communityChest options are being added to the array list
    public CommunityChest () {
        communityChestCards.add(new CommunityChestCard("Advance to go"));
        communityChestCards.add(new CommunityChestCard("Go back to Old Kent Road"));
        communityChestCards.add(new CommunityChestCard("Pay hospital $100"));
        communityChestCards.add(new CommunityChestCard("Doctor's fee. Pay $50"));
        communityChestCards.add(new CommunityChestCard("$10 fine or take a Chance"));
        communityChestCards.add(new CommunityChestCard("Bank error in your favour. Collect $200"));
        communityChestCards.add(new CommunityChestCard("Annuity matures. Collect $100"));
        communityChestCards.add(new CommunityChestCard("You inherit $100"));
        communityChestCards.add(new CommunityChestCard("From sale of stock you get $50"));
        communityChestCards.add(new CommunityChestCard("Receive interest on 7% preference shares, $25"));
        communityChestCards.add(new CommunityChestCard("Income tax refund. Collect $20"));
        communityChestCards.add(new CommunityChestCard("You have won second prize in a beauty contest. Collect $10"));
        communityChestCards.add(new CommunityChestCard("It is your birthday. Collect $10"));
        communityChestCards.add(new CommunityChestCard("Go to jail. Move directly to jail. Do not pass Go. Do not collect $200"));
        communityChestCards.add(new CommunityChestCard("Get out of jail free. This card may be kept until needed or sold"));





    }

}
