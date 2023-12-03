package upei.project;

abstract class NewBox {
    String boxName;
    int boxId;
    String boxType;

    Player ownedBy;

    public NewBox( String boxName,int boxId, Player ownedBy){
        this.ownedBy = ownedBy;
        this.boxName = boxName;
        this.boxId = boxId;
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
}
