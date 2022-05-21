package com.springcourse.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import com.springcourse.cursomc.domain.Category;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //define o controlador REST no endpoint /categorias, ou seja, localhost:8080/categorias, para esse caso
@RequestMapping(value="/categories")
public class CategoryResource {
  
  @RequestMapping(method = RequestMethod.GET) //Informa qual o método vc quer do HTTP, nesse caso, um GET.
  public List<Category> listar(){
    Category cat1 = new Category(1, "Informática");
    Category cat2 = new Category(2, "Escritório");

    List<Category> list = new ArrayList<>();
    list.add(cat1);
    list.add(cat2);

    return list;

  }
}
