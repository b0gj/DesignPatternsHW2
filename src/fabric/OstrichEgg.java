package fabric;

import utility.Constants;

public class OstrichEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.OSTRICH);
        System.out.println("Poof!\nA new Ostrich Egg has been created by the Magic Bag!\n");
    }
}
