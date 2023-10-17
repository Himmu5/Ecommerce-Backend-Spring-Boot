package com.example.ecommersebackend.service;

import com.example.ecommersebackend.Dto.ProductDto;
import com.example.ecommersebackend.dbo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductDto getProductById(String pId);
    List<ProductDto> getAllProducts(Pageable pageable);

}
