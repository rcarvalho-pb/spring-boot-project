package com.springcourse.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import com.springcourse.cursomc.domain.Category;
import com.springcourse.cursomc.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //define o controlador REST no endpoint /categorias, ou seja, localhost:8080/categorias, para esse caso
@RequestMapping(value="/categories")
public class CategoryResource {  
  @Autowired
  private CategoryService service;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET) //Informa qual o método vc quer do HTTP, nesse caso, um GET.
  public ResponseEntity<?> find(@PathVariable Integer id){
  
    Category obj = service.search(id);

    return ResponseEntity.ok().body(obj);

  }
}
