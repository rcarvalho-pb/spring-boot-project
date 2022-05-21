package com.springcourse.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //define o controlador REST no endpoint /categorias, ou seja, localhost:8080/categorias, para esse caso
@RequestMapping(value="/categorias")
public class CategoryResource {
  
  @RequestMapping(method = RequestMethod.GET) //Informa qual o método vc quer do HTTP, nesse caso, um GET.
  public String listar(){
    return "REST está funcionando";
  }
}
