package com.example.productdetailsservice.Repository;

import com.example.productdetailsservice.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.UUID;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger> {


    Product findByproductId(UUID productId);
}
