package com.example.freshShop_e_commerce.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String home(){
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
    public String gallery(){
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
