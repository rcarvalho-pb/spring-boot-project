package com.springcourse.cursomc.repositories;

import com.springcourse.cursomc.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Integer> {
  
}