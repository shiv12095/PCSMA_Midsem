package pcsma3.rest.data.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pcsma3.rest.data.app.entity.Person;

@RepositoryRestResource
interface PersonRepository extends CrudRepository<Person, Long> {
	
}
