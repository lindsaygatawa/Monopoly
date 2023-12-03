package upei.project;

import upei.project.NewBox;

public class LandBox extends NewBox {




    public Property property;





    public LandBox(String boxName, int boxId,Player ownedBy,int rent,  int l_boxPrice, String l_color) {
        super(boxName, boxId, ownedBy, rent,l_boxPrice, l_color);
        super.boxType = "land";

    }

}
