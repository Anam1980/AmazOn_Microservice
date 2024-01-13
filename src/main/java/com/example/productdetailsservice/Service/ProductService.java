package com.example.productdetailsservice.Service;

import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Product saveData(Product product) {
        product.setProductId(UUID.randomUUID());
        Product product1 = productRepo.save(product);

        return  product1;
    }

    public ArrayList<Product> getAllProducts() {
        List<Product> list = productRepo.findAll();

        return (ArrayList<Product>) list;
    }

    public Product getProductById(UUID productId) {
        Product product = productRepo.findByproductId(productId);

        return product;
    }
}
