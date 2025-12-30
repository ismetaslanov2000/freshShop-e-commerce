package com.example.freshShop_e_commerce.services.impls;

import com.example.freshShop_e_commerce.dtos.CategoryDto;
import com.example.freshShop_e_commerce.dtos.ProductDto;
import com.example.freshShop_e_commerce.models.Product;
import com.example.freshShop_e_commerce.repositories.ProductRepository;
import com.example.freshShop_e_commerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList=productRepository.findAll();
        return productList.stream().map(product -> {
            ProductDto productDto=new ProductDto();
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setImageUrl(product.getImageUrl());
            productDto.setSale(product.isSale());
            productDto.setPrice(product.getPrice());

            CategoryDto categoryDto=new CategoryDto();
            categoryDto.setId(product.getCategory().getId());
            categoryDto.setName(product.getCategory().getName());

            productDto.setCategoryDto(categoryDto);

            return productDto;

        }).collect(Collectors.toList());
    }
}
