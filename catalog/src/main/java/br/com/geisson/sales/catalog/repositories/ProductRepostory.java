package br.com.geisson.sales.catalog.repositories;

import br.com.geisson.sales.catalog.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepostory extends JpaRepository<Product, Long> {
}
