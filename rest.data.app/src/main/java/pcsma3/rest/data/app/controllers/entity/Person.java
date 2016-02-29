package pcsma3.rest.data.app.controllers.entity;

import org.springframework.data.annotation.Id;


public class Person {
	
	@Id
	private Long id;
	
	private String name;
	
}
