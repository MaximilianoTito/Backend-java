package shopjdbc.online.feature.many_to_one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/many_to_one/")
@CrossOrigin({"*"})
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("findAll")
    public List<Products> findAll(){
        return productsService.findAll();
    }

//     @GetMapping("findAllCategoria")
//     public List<Categoria> findAllCategotia(){
//         return productsService.findAllCategoria();
//     }
}
