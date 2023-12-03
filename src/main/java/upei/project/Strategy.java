package upei.project;

import java.util.Objects;

public class Strategy {
    public boolean shouldPurchaseBlueLand;
    public boolean shouldPurchaseRailway;

    public boolean shouldPurchaseYellowLand;

    public boolean shouldPurchaselightBlueLand;
    public boolean shouldPurchaseGreenLand;

    public boolean shouldPurchasePinkLand;

    public boolean shouldPurchaseRedLand;

    public boolean shouldPurchaseOrangeLand;

    public boolean shouldPurchaseBrownLand;

    public Strategy(boolean shouldPurchaseBlueLand, boolean shouldPurchaseRailway, boolean shouldPurchaseYellowLand, boolean shouldPurchaselightBlueLand, boolean shouldPurchaseGreenLand, boolean shouldPurchasePinkLand,boolean shouldPurchaseOrangeLand, boolean shouldPurchaseRedLand,boolean shouldPurchaseBrownLand) {
        this.shouldPurchaseBlueLand = shouldPurchaseBlueLand;
        this.shouldPurchaseRailway = shouldPurchaseRailway;
        this.shouldPurchaseYellowLand = shouldPurchaseYellowLand;
        this.shouldPurchaselightBlueLand = shouldPurchaselightBlueLand;
        this.shouldPurchasePinkLand = shouldPurchasePinkLand;
        this.shouldPurchaseGreenLand = shouldPurchaseGreenLand;
        this.shouldPurchaseOrangeLand = shouldPurchaseOrangeLand;
        this.shouldPurchaseRedLand = shouldPurchaseRedLand;
        this.shouldPurchaseBrownLand = shouldPurchaseBrownLand;



    }


    public boolean isShouldPurchaseBlueLand() {

        return shouldPurchaseBlueLand;
    }

    public void setShouldPurchaseBlueLand(boolean shouldPurchaseBlueLand) {
        this.shouldPurchaseBlueLand = shouldPurchaseBlueLand;
    }

    public boolean isShouldPurchaseRailway() {

        return shouldPurchaseRailway;
    }

    public void setShouldPurchaseRailway(boolean shouldPurchaseRailway) {
        this.shouldPurchaseRailway = shouldPurchaseRailway;
    }

    public boolean isShouldPurchaseYellowLand() {

        return shouldPurchaseYellowLand;
    }

    public void setShouldPurchaseYellowLand(boolean shouldPurchaseYellowLand) {
        this.shouldPurchaseYellowLand = shouldPurchaseYellowLand;
    }

    public boolean isShouldPurchaselightBlueLand() {

        return shouldPurchaselightBlueLand;
    }
    public void setShouldPurchaselightBlueLand(boolean shouldPurchaselightBlueLand) {
        this.shouldPurchaselightBlueLand = shouldPurchaselightBlueLand;
    }
    public boolean isShouldPurchaseBrownLand() {

        return shouldPurchaseBrownLand;
    }
    public void setShouldPurchaseBrownLand(boolean shouldPurchaseBrownLand) {
        this.shouldPurchaseBrownLand = shouldPurchaseBrownLand;
    }

    public boolean isShouldPurchasePinkLand() {

        return shouldPurchasePinkLand;
    }
    public void setShouldPurchasePinkLand(boolean shouldPurchasePinkLand) {
        this.shouldPurchasePinkLand = shouldPurchasePinkLand;
    }
    public boolean isShouldPurchaseRedLand() {

        return shouldPurchaseRedLand;
    }
    public void setShouldPurchaseRedLand(boolean shouldPurchaseRedLand) {
        this.shouldPurchaseRedLand = shouldPurchaseRedLand;
    }
    public void setShouldPurchaseGreenLand(boolean shouldPurchaseGreenLand) {
        this.shouldPurchaseGreenLand = shouldPurchaseGreenLand;
    }

    public boolean isShouldPurchaseGreenLand() {

        return shouldPurchaseGreenLand;
    }
    public void setShouldPurchaseOrangeLand(boolean shouldPurchaseOrangeLand) {
        this.shouldPurchaseOrangeLand = shouldPurchaseOrangeLand;
    }

    public boolean isShouldPurchaseOrangeLand() {

        return shouldPurchaseOrangeLand;

    }


}
