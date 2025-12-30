package com.example.freshShop_e_commerce.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SidebarDto {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
}