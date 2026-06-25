package generics_set_map.tipos_curinga;

import java.util.Arrays;
import java.util.List;

public class Program {
    static void main() {
       List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
       printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
