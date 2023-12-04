package upei.project;

public class CommunityChestCard {
    public  String description;

    public int boxID;
    public int cardPrice;


    public CommunityChestCard(String cdescription , int boxID ) {

        description = cdescription;
        this.boxID = boxID;
    }

    public CommunityChestCard(String cdescription , int boxID,int cardPrice ) {

        description = cdescription;
        this.boxID = boxID;
        this.cardPrice = cardPrice;
    }
}
