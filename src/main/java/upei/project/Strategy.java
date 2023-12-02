package upei.project;

import java.util.Objects;

public class Strategy {
    public boolean shouldPurchaseBlueLand;
    public boolean shouldPurchaseRailway;

    public boolean shouldPurchaseYellowLand;

    public Strategy(boolean shouldPurchaseBlueLand, boolean shouldPurchaseRailway, boolean shouldPurchaseYellowLand) {
        this.shouldPurchaseBlueLand = shouldPurchaseBlueLand;
        this.shouldPurchaseRailway = shouldPurchaseRailway;
        this.shouldPurchaseYellowLand = shouldPurchaseYellowLand;
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
}
