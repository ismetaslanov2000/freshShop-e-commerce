package com.example.freshShop_e_commerce.repositories;

import com.example.freshShop_e_commerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
