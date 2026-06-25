package generics_set_map.set_3_como_set_testa_igualdade;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode()
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private Double price;
}
