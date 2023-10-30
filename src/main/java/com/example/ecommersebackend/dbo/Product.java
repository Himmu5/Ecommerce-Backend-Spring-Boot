package com.example.ecommersebackend.dbo;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "products")
@Getter
@Setter
public class Product {
    @Id
    @Field(targetType = FieldType.STRING)
    private String id;
    private String title;
    private String description;
    private Integer price;
    private Long discountPercentage;
    private Long rating;
    private Integer stock;
    private String brand;

    @ManyToOne
    private CategoryDbo category;

    private String thumbnail;
}
