package upei.project;

public class ChanceCard {
    public  String description;
    public int boxId;
    public int cardPrice;

    public ChanceCard(String l_description,int boxId,int cardPrice) {
        description = l_description;
        this.boxId = boxId;
        this.cardPrice = cardPrice;
    }




    public ChanceCard(String l_description,int boxId) {
        this.boxId = boxId;
        description = l_description;

    }
}
