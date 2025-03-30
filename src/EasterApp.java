import fabric.Constants;
import fabric.Egg;
import fabric.EggFactory;
import fabric.MagicBag;
import singleton.EasterBunny;

public class EasterApp {
    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();

        EggFactory magicBag = new MagicBag();

        easterBunny.acquireMagicBag(magicBag);

        Egg firstChickenEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.CHICKEN);
        Egg firstOstrichEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.OSTRICH);
        Egg firstDinoEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.DINO);

    }
}
