package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Category;
import com.spring.repo.CategoryRepo;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
    private CategoryRepo categoryRepo;
	
	@PostMapping(value="/savecategory")
	public Category saveAllcategory( @RequestBody Category category) {
		System.out.println(category);
		return category;
	}

    @PostMapping("/categories")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category savedCategory = categoryRepo.save(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
   }

}
