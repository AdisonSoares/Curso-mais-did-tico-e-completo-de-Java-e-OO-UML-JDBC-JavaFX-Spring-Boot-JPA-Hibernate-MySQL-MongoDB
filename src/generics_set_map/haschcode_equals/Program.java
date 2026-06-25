package generics_set_map.haschcode_equals;

import java.awt.datatransfer.Clipboard;

public class Program {
    static void main() {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));//Comparação de conteúdo
        System.out.println(c1==c2);//Comparação de referencia na memória
    }
}
