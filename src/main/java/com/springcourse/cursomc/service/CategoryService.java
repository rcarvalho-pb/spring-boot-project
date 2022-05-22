package com.springcourse.cursomc.service;

import java.util.Optional;

import com.springcourse.cursomc.domain.Category;
import com.springcourse.cursomc.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
  @Autowired //No spring, o @Autowired instanciada uma dependencia automaticamente por inversao de controle ou injecao de dependencia
  private CategoryRepository repo;

  public Category search(Integer id){
    Optional <Category> obj = repo.findById(id);
    return obj.orElse(null);
  }
}
