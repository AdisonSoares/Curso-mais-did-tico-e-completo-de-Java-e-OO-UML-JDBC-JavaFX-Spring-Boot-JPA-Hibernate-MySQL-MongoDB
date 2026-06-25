package generics_set_map.tipos_curinga_delimitados_03_put_error;


import java.util.ArrayList;
import java.util.List;

/* PRINCÍPIO GET/PUT - CONTRAVARIÂNCIA */
public class Program {
    static void main() {
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        /* Não é possível consultar  - PUT-OK - GET-ERROR  */
        //Number x = myNums.get(0);
    }
}
