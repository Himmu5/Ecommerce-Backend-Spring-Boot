package com.example.ecommersebackend.controller;

import com.example.ecommersebackend.Dto.ProductDto;
import com.example.ecommersebackend.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    ProductService proudctService;

    @Autowired
    ModelMapper modelMapper;

//    @PostMapping(value = "" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public  List<ProductDto> createProduct(@RequestBody List<ProductDto> productDto){
//        List<Product> product = productDto.stream().map((p)->this.modelMapper.map(p , Product.class)).collect(Collectors.toList());
//
//        List<Product> newProduct = this.productRepo.insert(product);
//
//        return newProduct.stream().map((p)->this.modelMapper.map(p , ProductDto.class)).collect(Collectors.toList());
//    }
@GetMapping("")
public ResponseEntity<List<ProductDto>> getAllProducts(@PageableDefault(size = 10) Pageable pageable){
    List<ProductDto> productDtos =  this.proudctService.getAllProducts(pageable);
    return ResponseEntity.ok(productDtos);
}
    @GetMapping("/{productId}")
    public ProductDto getProductById(@PathVariable String productId){
        return this.proudctService.getProductById(productId);
    }

}
