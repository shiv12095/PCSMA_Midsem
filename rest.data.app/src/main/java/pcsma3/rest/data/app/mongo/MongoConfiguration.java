package pcsma3.rest.data.app.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;


@Component
public class MongoConfiguration {

	private final MongoDbFactory mongoDbFactory;
	
    @Autowired
    public MongoConfiguration(MongoDbFactory mongoDbFactory) {
        this.mongoDbFactory = mongoDbFactory;
    }

}