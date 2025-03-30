package fabric;

public class MagicBag extends EggFactory{
    @Override
    public Egg createEgg(String eggType) {

        Egg egg = switch (eggType) {
            case Constants.EggTypes.CHICKEN -> new ChickenEgg();
            case Constants.EggTypes.OSTRICH -> new OstrichEgg();
            case Constants.EggTypes.DINO -> new DinoEgg();
            default -> null;
        };

        if (egg == null){
            System.out.println("The Magic Bag isn't capable of making '" + eggType + "' eggs, please try with chicken, ostrich or dinosaur eggs");
            return null;
        }

        egg.create();

        return egg;
    }
}
