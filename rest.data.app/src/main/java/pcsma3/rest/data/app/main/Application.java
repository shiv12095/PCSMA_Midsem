package pcsma3.rest.data.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "pcsma3.rest.data.app")
@EntityScan(basePackages = "pcsma3.rest.data.app.entity")
@EnableJpaRepositories(basePackages = "pcsma3.rest.data.app.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
