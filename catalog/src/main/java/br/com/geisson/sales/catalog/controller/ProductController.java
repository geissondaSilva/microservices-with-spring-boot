package br.com.geisson.sales.catalog.controller;

import br.com.geisson.sales.catalog.models.Product;
import br.com.geisson.sales.catalog.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Long create(@RequestBody Product product) {
        return service.create(product);
    }

    @GetMapping
    public List<Product> list() {
        return service.listAll();
    }
}
