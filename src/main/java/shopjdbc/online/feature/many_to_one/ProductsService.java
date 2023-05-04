package shopjdbc.online.feature.many_to_one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;
    CategoriaRepository categoriaRepository;

    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    // public List<Categoria> findAllCategoria(){
    //     return categoriaRepository.findAllCategoria();
    // }

}
