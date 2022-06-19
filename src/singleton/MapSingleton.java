package singleton;

import lombok.Getter;

import java.util.Collections;
import java.util.Map;

public class MapSingleton {
    private static MapSingleton instance;
    @Getter
    private final Map<String, String> map;

    private MapSingleton(Map<String, String> map) {
        this.map = map;
    }

    public static MapSingleton instance(Map<String, String> map) {
        if (instance == null) {
            instance = new MapSingleton(Collections.emptyMap());
        }
        if (map != null) {
            instance = new MapSingleton(map);
        }
        return instance;
    }

}
