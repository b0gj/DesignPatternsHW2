import decorator.ColoredEgg;
import decorator.StickeredEgg;
import fabric.Egg;
import fabric.EggFactory;
import fabric.MagicBag;
import singleton.EasterBunny;
import utility.Constants;

public class EasterApp {
    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();

        EggFactory magicBag = new MagicBag();

        easterBunny.acquireMagicBag(magicBag);

        Egg firstChickenEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.CHICKEN);
        Egg firstOstrichEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.OSTRICH);
        Egg firstDinoEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.DINO);

        firstChickenEgg = new ColoredEgg(firstChickenEgg, "red");

        firstOstrichEgg = new StickeredEgg(firstOstrichEgg, "heart");

        firstDinoEgg = new ColoredEgg(firstDinoEgg, "blue");
        firstDinoEgg = new StickeredEgg(firstDinoEgg, "bunny");
        firstDinoEgg = new StickeredEgg(firstDinoEgg, "carrot");
    }
}
