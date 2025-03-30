import fabric.Constants;
import fabric.Egg;
import fabric.EggFactory;
import fabric.MagicBag;
import singleton.EasterBunny;

public class EasterApp {
    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();

        EggFactory magicBag = new MagicBag();

        Egg firstChickenEgg = magicBag.createEgg(Constants.EggTypes.CHICKEN);
        Egg firstOstrichEgg = magicBag.createEgg(Constants.EggTypes.OSTRICH);
        Egg firstDinoEgg = magicBag.createEgg(Constants.EggTypes.DINO);

    }
}
