package com.example.freshShop_e_commerce.services.impls;

import com.example.freshShop_e_commerce.dtos.CategoryDto;
import com.example.freshShop_e_commerce.repositories.CategoryRepository;
import com.example.freshShop_e_commerce.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private  final CategoryRepository categoryRepository;
    private  final ModelMapper modelMapper;
    @Override
    public List<CategoryDto> getAllCategories() {

        return categoryRepository.findAll().
                stream().map(category -> modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
    }
}
