package com.example.ecommersebackend.controller;

import com.example.ecommersebackend.Dto.ProductDto;
import com.example.ecommersebackend.dbo.Product;
import com.example.ecommersebackend.repositorie.ProductRepo;
import com.example.ecommersebackend.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    ProductService proudctService;

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    private ProductRepo productRepo;
//    @PostMapping(value = "" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public  List<ProductDto> createProduct(@RequestBody List<ProductDto> productDto){
//        List<Product> product = productDto.stream().map((p)->this.modelMapper.map(p , Product.class)).collect(Collectors.toList());
//
//        List<Product> newProduct = this.productRepo.insert(product);
//
//        return newProduct.stream().map((p)->this.modelMapper.map(p , ProductDto.class)).collect(Collectors.toList());
//    }
@GetMapping("")
public ResponseEntity<List<ProductDto>> getAllProducts(){
    List<ProductDto> productDtos =  this.proudctService.getAllProducts();
    return ResponseEntity.ok(productDtos);
}

    @GetMapping("/{productId}")
    public ProductDto getProductById(@PathVariable String productId){
        return this.proudctService.getProductById(productId);
    }



}
