package com.example.ecommersebackend.Dto;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductDto {
    private String id;
    private String title;
    private String description;
    private Integer price;
    private Long discountPercentage;
    private Long rating;
    private Integer stock;
    private String brand;
    private String category;
    private String thumbnail;
}
