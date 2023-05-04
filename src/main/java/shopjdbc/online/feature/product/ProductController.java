package shopjdbc.online.feature.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/feature/")
@CrossOrigin({"*"})
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @GetMapping("findAll")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("findAllTrue")
    public List<Product> findAllTrue(){
        return productService.findAllTrue();
    }

    @GetMapping("findAllFalse")
    public List<Product> findAllFalse(){
        return productService.findAllFalse();
    }

    @PostMapping("save")
    public Product save ( @RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id){
        productService.delete(id);
        return new ResponseEntity<>("dato eliminado", HttpStatus.OK);
    }

    @GetMapping(value="findById/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @DeleteMapping(value = "deleteAllFalse")
    public ResponseEntity<String> deleteAllFalse(){
        productService.deleteAllFalse();
        return new ResponseEntity<>("Datos Eliminados",HttpStatus.OK);
    }

    @PutMapping("updateById/{id}")
    public ResponseEntity<Void> updateById (@PathVariable Long id, @RequestBody Product product){
        productService.updateById(id, product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("findByName/{term}")
    public List<Product> findByName ( @PathVariable String term){
        return productService.findByName(term );
    }

}
