package singleton;

public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {}

    public static EasterBunny getInstance() {

        if (instance == null)
            instance = new EasterBunny();

        return instance;
    }
}
