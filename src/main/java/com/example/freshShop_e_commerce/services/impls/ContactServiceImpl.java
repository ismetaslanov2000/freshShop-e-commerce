package com.example.freshShop_e_commerce.services.impls;

import com.example.freshShop_e_commerce.dtos.ContactDto;
import com.example.freshShop_e_commerce.models.Contact;
import com.example.freshShop_e_commerce.repositories.ContactRepository;
import com.example.freshShop_e_commerce.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setName(contactDto.getName());
        contact.setEmail(contactDto.getEmail());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contactDto.getMessage());
        contactRepository.save(contact);
    }
}
