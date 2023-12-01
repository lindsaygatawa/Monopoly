package upei.project;

public class ChanceBox extends NewBox {

    public String boxName;
    public  int boxId;




    public ChanceBox(String name, int boxId) {
        boxName = name;
        this.boxId = boxId;
        boxType = "chance";

    }
}
