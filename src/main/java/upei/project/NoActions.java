package upei.project;

import java.util.ArrayList;

public class NoActions extends NewBox {
    String boxName;
    int boxId;

    int rent;

    ArrayList<NoActions> noActions = new ArrayList<>();



    public NoActions(String boxNamee, int boxID){
        super(boxNamee,boxID);
        super.boxType = "No actions";


    }

    public NoActions(String boxName, int boxId, int rent) {
        super(boxName, boxId, rent);
        super.boxType = "Tax";
    }
}
