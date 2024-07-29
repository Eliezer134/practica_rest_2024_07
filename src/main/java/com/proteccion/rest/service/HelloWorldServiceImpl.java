package com.proteccion.rest.service;

import com.proteccion.rest.model.dto.PersonaDto;
import com.proteccion.rest.model.entity.PersonaEntity;
import com.proteccion.rest.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

  @Autowired
  private HelloWorldRepository helloWorldRepository;

  @Override
  public String helloService() {
      return "Hello String from Service";
  }

  @Override
  public List<PersonaDto> helloRepository() {
    List<PersonaEntity> people = (List<PersonaEntity>) helloWorldRepository.findAll();
    /*
    List<PersonaDto> peopleDto = people.stream()
            .map(persona -> new PersonaDto(persona.getId(), persona.getPersonName()))
            .toList();
     */
    List<PersonaDto> peopleDto = new ArrayList<>();
    for (PersonaEntity persona : people) {
      peopleDto.add(new PersonaDto(persona.getId(), persona.getPersonName()));
    }
    return peopleDto;
  }
}
