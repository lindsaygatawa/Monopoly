package upei.project;

abstract class NewBox {
    String boxName;
    int boxId;
    String boxType;
    Player ownedBy;
    public int rent;
    public String color;
    public int boxPrice;


    public NewBox( String boxName,int boxId, Player ownedBy,int rent,int boxPrice,String color){
        this.ownedBy = ownedBy;
        this.boxName = boxName;
        this.boxId = boxId;
        this.rent = rent;
        this.color = color;
        this.boxPrice = boxPrice;
    }

    public NewBox(String boxName, int boxId) {
        this.boxName = boxName;
        this.boxId = boxId;

    }
    public Player getOwnedBy() {

        return ownedBy;
    }

    public void setOwnedBy(Player ownedBy) {
        this.ownedBy = ownedBy;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getRent() {
        return rent;
    }


}
