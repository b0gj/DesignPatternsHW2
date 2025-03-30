package decorator;

import fabric.Egg;

public abstract class EggDecorator extends Egg {

    protected Egg decoratedEgg;

    public EggDecorator(Egg egg) {
        this.decoratedEgg = egg;
        this.setType(decoratedEgg.getType());
        this.decorations = decoratedEgg.getDecorations();
        this.setHidingSpot(decoratedEgg.getHidingSpot());
    }

    @Override
    public void create() {
//        this.decoratedEgg.create();
    }
}
