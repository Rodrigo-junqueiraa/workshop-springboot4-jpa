package com.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
