package generics_set_map.generics;

import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: "+ps.firstValue());
        sc.close();
    }
}
