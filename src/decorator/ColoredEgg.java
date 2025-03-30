package decorator;

import fabric.Egg;

public class ColoredEgg extends EggDecorator{

    private final String color;

    public ColoredEgg(Egg egg, String color) {
        super(egg);
        this.color = color;

        this.addColor();
    }

    @Override
    public void create() {
//        super.create();
    }

    private void addColor() {
        decoratedEgg.addDecoration("Color: " + color);
        System.out.println("The " + decoratedEgg.getType() + " egg has been painted with the color " + this.color);
        System.out.println();
    }
}
