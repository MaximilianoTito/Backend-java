package shopjdbc.online.feature.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table(name = "product", schema = "onlineshop")
public class Product {
    @Id
    private Long id_product;   
    private String name;
    private Double price;
    private long quantity;
    private Boolean archived;
}
