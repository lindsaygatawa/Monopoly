package upei.project;

import java.util.ArrayList;

public class CommunityChest {
    ArrayList<CommunityChestCard> communityChestCards = new ArrayList<>();

    // communityChest options are being added to the array list
    public CommunityChest () {
        communityChestCards.add(new CommunityChestCard("Advance to go", 1));
        communityChestCards.add(new CommunityChestCard("Go back to Old vetnor",28));
        communityChestCards.add(new CommunityChestCard("Pay hospital $100",-1,100));
        communityChestCards.add(new CommunityChestCard("Doctor's fee. Pay $50", -1,50));
        communityChestCards.add(new CommunityChestCard("pay $10",-1,10));
        communityChestCards.add(new CommunityChestCard("Bank error in your favour. Collect $200",0,200));
        communityChestCards.add(new CommunityChestCard("Annuity matures. Collect $100",0,100));
        communityChestCards.add(new CommunityChestCard("You inherit $100",0,100));
        communityChestCards.add(new CommunityChestCard("From sale of stock you get $50",0,50));
        communityChestCards.add(new CommunityChestCard("Receive interest on 7% preference shares, $25",0,25));
        communityChestCards.add(new CommunityChestCard("Income tax refund. Collect $20",0,20));
        communityChestCards.add(new CommunityChestCard("You have won second prize in a beauty contest. Collect $10",0,10));
        communityChestCards.add(new CommunityChestCard("It is your birthday. Collect $10",0,10));
        communityChestCards.add(new CommunityChestCard("Go to jail. Move directly to jail. Do not pass Go. Do not collect $200",11));
        communityChestCards.add(new CommunityChestCard("Get out of jail free. This card may be kept until needed or sold",0));





    }

}
