package generics_set_map.set_3_como_set_testa_igualdade;

import java.util.HashSet;
import java.util.Set;

//Quando não tem hascode equals é comparado por ponteiro - false
//Quanto tem hashcode equals é comparado por conteúdo - true
public class Program {
    static void main() {
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod =  new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
