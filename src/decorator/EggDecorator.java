package decorator;

import fabric.Egg;

public abstract class EggDecorator extends Egg {

    protected Egg decoratedEgg;

    public EggDecorator(Egg egg) {
        this.decoratedEgg = egg;
    }

    @Override
    public void create() {
//        this.decoratedEgg.create();
    }
}
