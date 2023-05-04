package shopjdbc.online.feature.many_to_one;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;


@Data

@Table(name = "productos", schema = "manytoone")
public class Products {
    
    @Id
    private Long idProducto;
    private long idCategoria;
    private String name;
    private Categoria categoria;
}