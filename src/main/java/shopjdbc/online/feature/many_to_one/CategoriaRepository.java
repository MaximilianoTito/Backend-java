package shopjdbc.online.feature.many_to_one;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository <Categoria, Long> {
    // List<Categoria> findAllCategoria();
}
