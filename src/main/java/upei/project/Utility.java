package upei.project;

public class Utility extends NewBox{



    public int boxPrice;
    public int Rent;
    public Property property;







    public Utility(String boxName, int boxId,Player ownedBy, int l_boxPrice, int l_rent) {
        super(boxName, boxId, ownedBy,l_boxPrice);
        boxType = "Utility";
        Rent = l_rent;



    }

}
