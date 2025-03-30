package fabric;

import utility.Constants;

public class ChickenEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.CHICKEN);
        System.out.println("Poof!\nA new Chicken Egg has been created by the Magic Bag!\n");
    }
}
