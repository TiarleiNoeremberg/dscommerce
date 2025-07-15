package com.tiarlei.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiarlei.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
}
