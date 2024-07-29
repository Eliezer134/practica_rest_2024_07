package com.proteccion.rest.controller;

import com.proteccion.rest.model.dto.PersonaDto;
import com.proteccion.rest.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

  private final String HELLO_SERVICE = "/service";
  private final String HELLO_REPOSITORY = "/repository";

  //Se declara una Interfaz, pero se inyecta un Objeto
  @Autowired
  private HelloWorldService helloWorldService;

  @GetMapping
  private String helloString(){
    return "Hola String";
  }

  @RequestMapping(method = RequestMethod.GET, path = HELLO_SERVICE)
  private String helloService(){
    return helloWorldService.helloService();
  }

  @GetMapping(HELLO_REPOSITORY)
  private List<PersonaDto> helloRepository(){
    return helloWorldService.helloRepository();
  }
}
