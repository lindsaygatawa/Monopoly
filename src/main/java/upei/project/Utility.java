package upei.project;

public class Utility extends NewBox{
    public Player ownedBy;

    public int boxPrice;




    public Property property;

    public Player getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(Player ownedBy) {

        this.ownedBy = ownedBy;
    }



    public Utility(String boxName, int boxId, int l_boxPrice, int l_rent, String l_color) {
        super(boxName, boxId);
        super.boxType = "Utility";
        boxPrice = l_boxPrice;



    }

}
