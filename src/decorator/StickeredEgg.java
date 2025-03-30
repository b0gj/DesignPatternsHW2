package decorator;

import fabric.Egg;

public class StickeredEgg extends EggDecorator{

    private final String sticker;

    public StickeredEgg(Egg egg, String sticker) {
        super(egg);
        this.sticker = sticker;

        this.addSticker();
    }

    @Override
    public void create() {
//        super.create();
    }

    private void addSticker() {
        decoratedEgg.addDecoration("Sticker: " + sticker);
        this.decorations = decoratedEgg.getDecorations();
        System.out.println("The " + decoratedEgg.getType() + " egg has a new sticker on it: " + this.sticker);
        System.out.println();
    }
}
