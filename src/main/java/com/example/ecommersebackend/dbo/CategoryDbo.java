package com.example.ecommersebackend.dbo;

import jakarta.persistence.*;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Categories")
@EnableMongoAuditing
public class CategoryDbo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(nullable = false , length = 500)
    private String categoryTitle;

    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

}
