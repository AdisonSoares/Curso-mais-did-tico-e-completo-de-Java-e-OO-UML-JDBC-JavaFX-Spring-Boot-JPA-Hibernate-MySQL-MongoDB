package generics_set_map.set_3_como_treeSet_testa_igualdade.set_3_como_set_testa_igualdade;

import lombok.*;

@EqualsAndHashCode()
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    @Override
    public int compareTo(Product other) {
        return name.toLowerCase().compareTo(other.getName().toLowerCase());
    }
}
