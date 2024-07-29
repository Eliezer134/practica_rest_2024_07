package com.proteccion.rest.service;

import com.proteccion.rest.model.dto.PersonaDto;
import com.proteccion.rest.model.entity.PersonaEntity;

import java.util.List;

public interface HelloWorldService {

  public String helloService();
  public List<PersonaDto> helloRepository();
}
