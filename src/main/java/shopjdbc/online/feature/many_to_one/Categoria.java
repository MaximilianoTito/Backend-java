package shopjdbc.online.feature.many_to_one;

// import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(value = "categoria",  schema = "manytoone")
public class Categoria {
    @Id
    private Long id_categoria;
    private String name;
    // private List<Products> products;
}