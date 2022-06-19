package singleton;

import model.Cat;

public class CatSingleton1 {

    private static CatSingleton1 instance;
    private final Cat cat;

    private CatSingleton1(Cat cat) {
        this.cat = cat;
    }

    public static CatSingleton1 instance(Cat cat) {
        if (instance == null){
            instance = new CatSingleton1(new Cat());
        }
        if (cat != null){
            instance = new CatSingleton1(cat);
        }
        return instance;
    }

    public Cat getCat(){
        return cat;
    }
}
