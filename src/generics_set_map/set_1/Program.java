package generics_set_map.set_1;

import java.util.HashSet;
import java.util.Set;

public class Program {
    static void main() {
        Set<String> set = new HashSet<String>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
