package br.com.geisson.sales.catalog.controller;

import br.com.geisson.sales.catalog.models.Category;
import br.com.geisson.sales.catalog.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public Long create(@RequestBody Category category) {
        return service.create(category);
    }
}
