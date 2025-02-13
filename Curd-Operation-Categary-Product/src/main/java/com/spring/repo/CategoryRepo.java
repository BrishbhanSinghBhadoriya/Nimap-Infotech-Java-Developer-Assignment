package com.spring.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>
{

	@SuppressWarnings("unchecked")
	com.spring.entity.Category save(com.spring.entity.Category category);
	

}
