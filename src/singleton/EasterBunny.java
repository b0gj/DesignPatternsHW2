package singleton;

import fabric.Egg;
import fabric.EggFactory;

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
    }

    public Egg useMagicBagToCreateEgg(String eggType) {
        return this.magicBag.createEgg(eggType);
    }

}
