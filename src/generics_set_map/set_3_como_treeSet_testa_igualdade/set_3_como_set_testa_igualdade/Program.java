package generics_set_map.set_3_como_treeSet_testa_igualdade.set_3_como_set_testa_igualdade;

import java.util.Set;
import java.util.TreeSet;

//Quando usa treeset a classe do conjunto, no caso Product, tem que ser uma implementação de Comparable para ordenar
public class Program {
    static void main() {
        Set<Product> set = new TreeSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
