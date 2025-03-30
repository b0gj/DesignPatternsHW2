package fabric;

import utility.Constants;

public class DinoEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.DINO);
        System.out.println("Poof!\nA new Dinosaur Egg has been created by the Magic Bag!\n");
    }
}
