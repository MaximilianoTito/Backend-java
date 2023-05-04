package shopjdbc.online.feature.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product, Long> {
    final String FIND_ALL_FALSE = "SELECT * FROM onlineshop.product WHERE archived = false";
    final String FIND_ALL_TRUE = "SELECT * FROM onlineshop.product WHERE archived = true";
    final String DELETE_BY_ID = "DELETE FROM onlineshop.product WHERE id_product= :id";
    final String DELETE_ALL_FALSE = "DELETE FROM onlineshop.product WHERE archived= false";
    final String FIND_BY_NAME = "SELECT * FROM onlineshop.product WHERE name ILIKE '%F%'";

    List<Product> findAll();

    @Query(value = FIND_ALL_FALSE)
    List<Product> findAllFalse();

    @Query(value = FIND_ALL_TRUE)
    List<Product> findAllTrue();

    @Query(value = DELETE_BY_ID)
    void delete(@Param("id") Long id);

    Optional<Product> findById(Long id);

    @Query(value = DELETE_ALL_FALSE)
    void deleteAllFalse();
    
    List<Product> findByNameLikeIgnoreCase(String term);

}
