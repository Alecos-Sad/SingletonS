package solution;

import model.Cat;
import singleton.BooleanSingleton;
import singleton.CatSingleton1;
import singleton.ListSingleton;
import singleton.MapSingleton;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution2 {

    public void show1() {
        System.out.println("Solution 2 : show 1");
        Cat cat = CatSingleton1.instance(null).getCat();
        System.out.println(cat);
    }

    public void show2() {
        System.out.println("Solution 2 : show 2");
        List<String> list = ListSingleton.instance(null).getList();
        System.out.println(Arrays.toString(list.toArray()));
    }

    public void show3() {
        System.out.println("Solution 2 : show 3");
        Map<String, String> map = MapSingleton.instance(null).getMap();
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

    public void show4() {
        System.out.println("Solution 1 : show 4");
        Boolean bool = BooleanSingleton.instance(null).getBool();
        System.out.println(bool);
    }
}
