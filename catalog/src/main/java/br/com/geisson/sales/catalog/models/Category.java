package br.com.geisson.sales.catalog.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
@SequenceGenerator(name = "gen_category", sequenceName = "seq_category", allocationSize = 1)
public class Category {

    @Id
    @GeneratedValue(generator = "gen_category")
    private Long id;

    private String name;
}
