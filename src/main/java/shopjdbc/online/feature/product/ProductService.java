package shopjdbc.online.feature.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findAllTrue() {
        return productRepository.findAllTrue();
    }

    public List<Product> findAllFalse() {
        return productRepository.findAllFalse();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.delete(id);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public void deleteAllFalse(){
        productRepository.deleteAllFalse();
    }

    public void updateById ( Long id, Product product){
        Product existingProduct = productRepository.findById(id).orElse(new Product());
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setArchived(product.getArchived());
        productRepository.save(existingProduct);
    }

    public List<Product> findByName (String term){
        return productRepository.findByNameLikeIgnoreCase( "%" + term + "%");
    }

}
