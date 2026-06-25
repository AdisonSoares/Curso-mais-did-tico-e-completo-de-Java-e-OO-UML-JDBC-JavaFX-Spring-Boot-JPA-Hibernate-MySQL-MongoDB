package generics_set_map.tipos_curinga_delimitados_02_get_error;

import java.util.ArrayList;
import java.util.List;

/* PRINCÍPIO GET/PUT - COVARIÂNCIA */
public class Program {
    static void main() {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        /* Não é possível adicionar - GET-OK - PUT-ERROR */
        //list.add(20);
    }
}
