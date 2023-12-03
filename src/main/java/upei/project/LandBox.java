package upei.project;

import upei.project.NewBox;

public class LandBox extends NewBox {


    public  String color;
    public int boxPrice;

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int rent;

    public Property property;





    public LandBox(String boxName, int boxId,Player ownedBy,int l_boxPrice, int l_rent, String l_color) {
        super(boxName, boxId, ownedBy);
        super.boxType = "land";
        boxPrice = l_boxPrice;
        rent = l_rent;
        color = l_color;

    }

}
