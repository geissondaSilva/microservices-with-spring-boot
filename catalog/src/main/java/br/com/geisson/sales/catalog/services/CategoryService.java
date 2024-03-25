package br.com.geisson.sales.catalog.services;

import br.com.geisson.sales.catalog.models.Category;
import br.com.geisson.sales.catalog.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Long create(Category category) {
        repository.save(category);
        return category.getId();
    }
}
