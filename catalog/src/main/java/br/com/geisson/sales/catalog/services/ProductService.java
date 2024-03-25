package br.com.geisson.sales.catalog.services;

import br.com.geisson.sales.catalog.models.Product;
import br.com.geisson.sales.catalog.repositories.ProductRepostory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepostory repostory;

    public ProductService(ProductRepostory repostory) {
        this.repostory = repostory;
    }

    public Long create(Product product) {
        product = repostory.save(product);
        return product.getId();
    }

    public List<Product> listAll() {
        return repostory.findAll();
    }
}
