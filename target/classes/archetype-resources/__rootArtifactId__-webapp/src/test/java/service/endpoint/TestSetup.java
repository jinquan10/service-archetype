#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.endpoint;

import java.io.IOException;

import org.junit.BeforeClass;
import ${package}.service.collection.Person;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

public class TestSetup {
	@BeforeClass
	public static void beforeClass() throws IOException{
		MongoTemplate mongoTemplate = new MongoTemplate(new Mongo("localhost", 27017), "service", new UserCredentials("", ""));
		
		mongoTemplate.getDb().dropDatabase();

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("æˆ‘èƒ½å�žä¸‹çŽ»ç’ƒè€Œ");

		mongoTemplate.insert(person);
	}
}
