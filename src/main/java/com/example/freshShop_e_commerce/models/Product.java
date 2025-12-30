package com.example.freshShop_e_commerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String imageUrl;
    private boolean sale;
    private  Double price;
    //    private  String description;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


}
