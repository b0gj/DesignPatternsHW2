package strategy;

import fabric.Egg;
import utility.Constants;

public class BushHide implements HidingStrategy{
    @Override
    public void hide(Egg egg) {
        egg.setHidingSpot(Constants.HidingSpots.BUSH);
        System.out.println("The easter bunny hid the " + egg.getType() + " egg" + egg.getDecorations() + " in the " + egg.getHidingSpot());
    }
}
