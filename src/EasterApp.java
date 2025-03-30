import decorator.ColoredEgg;
import decorator.StickeredEgg;
import fabric.Egg;
import fabric.EggFactory;
import fabric.MagicBag;
import singleton.EasterBunny;
import strategy.BasketHide;
import strategy.BushHide;
import strategy.ForestHide;
import utility.Constants;

public class EasterApp {
    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();

        EggFactory magicBag = new MagicBag();

        easterBunny.acquireMagicBag(magicBag);

        System.out.println();

        Egg firstChickenEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.CHICKEN);
        Egg firstOstrichEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.OSTRICH);
        Egg firstDinoEgg = easterBunny.useMagicBagToCreateEgg(Constants.EggTypes.DINO);

        System.out.println();

        firstChickenEgg = new ColoredEgg(firstChickenEgg, "red");

        firstOstrichEgg = new StickeredEgg(firstOstrichEgg, "heart");

        firstDinoEgg = new ColoredEgg(firstDinoEgg, "blue");
        firstDinoEgg = new StickeredEgg(firstDinoEgg, "bunny");
        firstDinoEgg = new StickeredEgg(firstDinoEgg, "carrot");

        System.out.println();

        easterBunny.hide(firstChickenEgg, new BasketHide());
        easterBunny.hide(firstOstrichEgg, new ForestHide());
        easterBunny.hide(firstDinoEgg, new BushHide());
    }
}
