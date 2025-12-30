package com.example.freshShop_e_commerce.controller;

import com.example.freshShop_e_commerce.dtos.ContactDto;
import com.example.freshShop_e_commerce.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @GetMapping("/contact-us")
    public String contact_us(Model model) {
        model.addAttribute("contact",new ContactDto());
        return "contact-us.html";
    }

    @PostMapping("/contact-us")
    public String addContact( ContactDto contactDto){
        contactService.addContact(contactDto);
        return "redirect:/";
    }

}