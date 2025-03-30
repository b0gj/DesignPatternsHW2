package fabric;

import java.util.ArrayList;

public class OstrichEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.OSTRICH);
        this.decorations = new ArrayList<>();
        System.out.println("Poof!\nA new Ostrich Egg has been created by the Magic Bag!");
    }
}
