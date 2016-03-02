package pcsma3.rest.data.app.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import pcsma3.rest.data.app.document.Car;

@RepositoryRestResource(path = "repo")
public interface CarRepository extends MongoRepository<Car, String> {

	@RestResource(path = "drive")
	List<Car> findByDrive(@Param("drive") int drive);
	
	@RestResource(path = "model")
	Page findByModel(@Param("model") String model, Pageable p);
	
}
