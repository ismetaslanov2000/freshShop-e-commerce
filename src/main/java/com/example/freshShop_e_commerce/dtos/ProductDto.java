package com.example.freshShop_e_commerce.dtos;

import com.example.freshShop_e_commerce.models.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private  String name;
    private  String imageUrl;
    private boolean sale;
    private  Double price;
    private CategoryDto categoryDto;
}
