package shopjdbc.online.feature.many_to_one;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {

    final String FindAll= "SELECT mp.id_producto, mc.id_categoria, mp.id_categoria, mp.name , mc.name FROM manytoone.productos as mp LEFT JOIN manytoone.categoria as mc ON mp.id_categoria = mc.id_categoria;";
    
    @Query(value = FindAll)
    List<Products> findAll();


}
