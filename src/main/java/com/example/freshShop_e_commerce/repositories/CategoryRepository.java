package com.example.freshShop_e_commerce.repositories;

import com.example.freshShop_e_commerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
