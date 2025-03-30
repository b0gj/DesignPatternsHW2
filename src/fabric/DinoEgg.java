package fabric;

import java.util.ArrayList;

public class DinoEgg extends Egg{
    @Override
    public void create() {
        this.setType(Constants.EggTypes.DINO);
        this.decorations = new ArrayList<>();
        System.out.println("Poof!\nA new Dinosaur Egg has been created by the Magic Bag!");
    }
}
