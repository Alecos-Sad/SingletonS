package singleton;

import lombok.Getter;

public class BooleanSingleton {
    private static BooleanSingleton instance;
    @Getter
    private final Boolean bool;

    private BooleanSingleton(Boolean bool) {
        this.bool = bool;
    }

    public static BooleanSingleton instance(Boolean bool) {
        if (instance == null) {
            instance = new BooleanSingleton(false);
        }
        if (bool != null) {
            instance = new BooleanSingleton(bool);
        }
        return instance;
    }
}
