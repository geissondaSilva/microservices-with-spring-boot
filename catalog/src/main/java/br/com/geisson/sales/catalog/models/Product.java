package br.com.geisson.sales.catalog.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
@SequenceGenerator(name = "gen_product", sequenceName = "seq_product", allocationSize = 1)
public class Product {

    @Id
    @GeneratedValue(generator = "gen_product", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
