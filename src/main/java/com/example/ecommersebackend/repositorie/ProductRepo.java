package com.example.ecommersebackend.repositorie;

import com.example.ecommersebackend.dbo.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product , String> {
}
