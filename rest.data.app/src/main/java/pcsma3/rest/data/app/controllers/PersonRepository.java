package pcsma3.rest.data.app.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pcsma3.rest.data.app.controllers.entity.Person;

@RepositoryRestResource(path = "person")
interface PersonRepository extends CrudRepository<Person, Long> {
	
}
