package com.proteccion.rest.data;

import com.proteccion.rest.model.entity.PersonaEntity;
import com.proteccion.rest.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        helloWorldRepository.save(new PersonaEntity(1L, "Juan", "Pass1"));
        helloWorldRepository.save(new PersonaEntity(2L, "Maria", "Pass2"));
        helloWorldRepository.save(new PersonaEntity(3L, "Pedro", "Pass3"));
    }

}
