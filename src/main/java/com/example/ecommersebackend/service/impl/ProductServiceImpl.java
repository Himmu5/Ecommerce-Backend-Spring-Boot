package com.example.ecommersebackend.service.impl;

import com.example.ecommersebackend.Dto.ProductDto;
import com.example.ecommersebackend.dbo.Product;
import com.example.ecommersebackend.exception.ResourceNotFound;
import com.example.ecommersebackend.repositorie.ProductRepo;
import com.example.ecommersebackend.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ProductDto getProductById(String pId) {
        Product product = this.productRepo.findById(pId).orElseThrow(()->new ResourceNotFound(400 , "Product Not Found"));
        return this.modelMapper.map(product , ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProducts(Pageable pageable) {

        Page<Product> products =  this.productRepo.findAll(pageable);

        return products.stream().map((p)->this.modelMapper.map(p , ProductDto.class)).collect(Collectors.toList());
    }

}
