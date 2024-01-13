package com.example.productdetailsservice.Entity;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.UUID;

@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Product {

    @Id
    @Generated
    BigInteger id;

    UUID productId;

    String name;

    double price;

    double rating;

    String imageURL;




}
