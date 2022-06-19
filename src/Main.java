import model.Cat;
import singleton.BooleanSingleton;
import singleton.CatSingleton1;
import singleton.ListSingleton;
import singleton.MapSingleton;
import solution.Solution1;
import solution.Solution2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Tom", 5);
//        Solution1 solution1 = new Solution1();
//        Solution2 solution2 = new Solution2();
//
//        solution1.show1();
//        solution2.show1();
//        CatSingleton1.instance(cat);
//        solution1.show1();
//        solution2.show1();

//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"a","b","c","d");
//        Solution1 solution1 = new Solution1();
//        Solution2 solution2 = new Solution2();
//        solution1.show2();
//        solution2.show2();
//        ListSingleton.instance(list);
//        solution2.show2();
//        solution1.show2();
//        solution2.show2();

//        Map<String, String> map = new HashMap<>();
//        map.put("a", "aaa");
//        map.put("b", "bbb");
//        map.put("c", "ccc");
//        Solution1 solution1 = new Solution1();
//        Solution2 solution2 = new Solution2();
//        solution1.show3();
//        solution2.show3();
//        MapSingleton.instance(map);
//        solution1.show3();
//        solution2.show3();
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        solution1.show4();
        solution2.show4();
        BooleanSingleton.instance(true);
        solution1.show4();
        solution2.show4();

    }


}
