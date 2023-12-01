package upei.project;

public class ChanceBox extends NewBox {

    public String boxName;
    public  int boxId;




    public ChanceBox(String boxName, int boxId) {
        super(boxName, boxId);
        super.boxType = "chance";

    }
}
