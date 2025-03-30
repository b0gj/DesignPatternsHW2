package fabric;

import java.util.ArrayList;

public class ChickenEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.CHICKEN);
        this.decorations = new ArrayList<>();
        System.out.println("Poof!\nA new Chicken Egg has been created by the Magic Bag!");
    }
}
