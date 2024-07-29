package com.proteccion.rest.repository;

import com.proteccion.rest.model.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends CrudRepository<PersonaEntity, Long>{
}