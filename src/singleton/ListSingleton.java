package singleton;

import lombok.Getter;
import java.util.Collections;
import java.util.List;

public class ListSingleton {
    private static ListSingleton instance;
    @Getter
    private final List<String> list;

    private ListSingleton(List<String> list) {
        this.list = list;
    }

    public static ListSingleton instance(List<String> list){
        if (instance == null){
            instance = new ListSingleton(Collections.emptyList());
        }
        if (list != null && list.size() > 0){
            instance = new ListSingleton(list);
        }
        return instance;
    }
}
