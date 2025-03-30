package strategy;

import fabric.Egg;
import utility.Constants;

public class BasketHide implements HidingStrategy{
    @Override
    public void hide(Egg egg) {
        egg.setHidingSpot(Constants.HidingSpots.BASKET);
        System.out.println("The easter bunny hid the " + egg.getType() + " egg in the " + egg.getHidingSpot());
    }
}
