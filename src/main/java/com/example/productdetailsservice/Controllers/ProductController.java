package com.example.productdetailsservice.Controllers;

import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public ResponseEntity saveData(@RequestBody Product product){
        Product product1 = productService.saveData(product);

        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity getAllProducts(){
        ArrayList<Product> productArrayList = productService.getAllProducts();
        return  new ResponseEntity<>(productArrayList, HttpStatus.FOUND);

    }

    @GetMapping("/search/{productId}")
    public ResponseEntity getProductById(@PathVariable UUID productId){
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.FOUND);
    }
}
