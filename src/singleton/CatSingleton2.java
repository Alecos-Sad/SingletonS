package singleton;

import model.Cat;

public class CatSingleton2 {
    private static CatSingleton2 instance;
    private final Cat cat;

    private CatSingleton2(Cat cat) {
        this.cat = cat;
    }

    public static CatSingleton2 instance() {
        if (instance == null) {
            instance = new CatSingleton2(new Cat());
        }
        return instance;
    }

    public Cat getCat() {
        return cat;
    }

    public static void setCat(Cat cat) {
        instance = new CatSingleton2(
                cat == null ? new Cat() : cat
        );
    }
}
