package com.example.freshShop_e_commerce.services;

import com.example.freshShop_e_commerce.dtos.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
}
