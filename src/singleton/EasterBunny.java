package singleton;

import fabric.Egg;
import fabric.EggFactory;
import strategy.HidingStrategy;

public class EasterBunny {
    private static EasterBunny instance;

    private EggFactory magicBag;

    private EasterBunny() {}

    public static EasterBunny getInstance() {

        if (instance == null)
            instance = new EasterBunny();

        return instance;
    }

    public void acquireMagicBag(EggFactory magicBag) {
        this.magicBag = magicBag;
        System.out.println("The Easter Bunny has acquired a magic bag. Be concerned!\n");
    }

    public Egg useMagicBagToCreateEgg(String eggType) {
        return this.magicBag.createEgg(eggType);
    }

    public void hide(Egg egg, HidingStrategy hidingStrategy) {
        hidingStrategy.hide(egg);
    }

}
