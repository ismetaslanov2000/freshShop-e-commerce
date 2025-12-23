package com.example.freshShop_e_commerce.controller;

import com.example.freshShop_e_commerce.dtos.CategoryDto;
import com.example.freshShop_e_commerce.dtos.ProductDto;
import com.example.freshShop_e_commerce.services.CategoryService;
import com.example.freshShop_e_commerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private  final CategoryService categoryService;
    private  final ProductService productService;

    @GetMapping("/")
    public String home(Model model){
        return "index.html";
    }
    @GetMapping("/about")
    public String about(){
        return "about.html";
    }
    @GetMapping("/cart")
    public String cart(){
        return "cart.html";
    }
    @GetMapping("/gallery")
    public String gallery(Model model){
        List<CategoryDto>categoryDtoList=categoryService.getAllCategories();
        model.addAttribute("categories",categoryDtoList);
        List<ProductDto> productDtoList=productService.getAllProducts();
        model.addAttribute("products",productDtoList);

        return "gallery.html";
    }
    @GetMapping("/checkout")
    public String checkout(){
        return "checkout.html";
    }
    @GetMapping("/contact-us")
    public String contact_us(){
        return "contact-us.html";
    }
    @GetMapping("/my-account")
    public String my_account(){
        return "my-account.html";
    }
    @GetMapping("/shop-detail")
    public String shop_detail(){
        return "shop-detail.html";
    }
    @GetMapping("/shop")
    public String shop(){
        return "shop.html";
    }
    @GetMapping("/wishlist")
    public String wishlist(){
        return "wishlist.html";
    }
}
