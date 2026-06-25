package generics_set_map.tipos_curinga_delimitados_04_put_get_solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* PRINCÍPIO GET/PUT - COVARIANCIA E CONTRAVARIANCIA */
public class Program {
    static void main() {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {//ACESSAR TODOS OS TIPOS
            destiny.add(number);//ADICIONAR TODOS OS TIPOS
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
