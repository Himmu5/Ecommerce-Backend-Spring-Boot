package com.example.ecommersebackend.service;

import com.example.ecommersebackend.Dto.ProductDto;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {

    ProductDto getProductById(String pId);
    List<ProductDto> getAllProducts();
}
