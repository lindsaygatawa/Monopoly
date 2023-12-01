package upei.project;

import upei.project.NewBox;

public class LandBox extends NewBox {
    public String boxName;
    public  int boxId;
    public Player ownedBy;

    public String boxType;
    public  String color;

    public int boxPrice;
    public int rent;

    public Property property;

    public Player getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(Player ownedBy) {
        this.ownedBy = ownedBy;
    }



    public LandBox(String boxName, int boxId, Player player, int l_boxPrice, int l_rent, String l_color) {
        super(boxName, boxId);
        boxPrice = l_boxPrice;
        rent = l_rent;
        super.boxType = "land";
        color = l_color;

    }

}
