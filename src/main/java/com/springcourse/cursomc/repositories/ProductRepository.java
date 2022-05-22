package com.springcourse.cursomc.repositories;

import com.springcourse.cursomc.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
  
}
