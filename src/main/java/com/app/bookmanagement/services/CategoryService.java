package com.app.bookmanagement.services;

import com.app.bookmanagement.entity.Author;
import com.app.bookmanagement.entity.Category;
import com.app.bookmanagement.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    public List<Category> createCategoryList(List<Category> list){
        return categoryRepository.saveAll(list);
    }
    public List<Category> getCategoryList(){ return categoryRepository.findAll(); }
    public Optional<Category> getCategoryById(int categoryId) {
        return categoryRepository.findById(categoryId);
    }
    public Category updateCategoryById(Category category) {
        Optional<Category> categoryFound = categoryRepository.findById(category.getCategoryId());

        if (categoryFound.isPresent()) {
            Category categoryUpdate = categoryFound.get();
            categoryUpdate.setCategoryName(category.getCategoryName());

            return categoryRepository.save(category);
        } else {
            return null;
        }
    }
    public String deleteCategoryByID(int categoryId){
        categoryRepository.deleteById(categoryId);
        return "Category "+ categoryId +" is deleted";
    }
}
