package it.pkg.service.config;

import it.pkg.service.util.EnvironmentPropertyPlaceholderConfigurer;
import it.pkg.service.util.MongoCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.Mongo;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "it.pkg.service")
public class AppConfig {
	@Bean
	public EnvironmentPropertyPlaceholderConfigurer environmentPropertyPlaceholderConfigurer() {
		EnvironmentPropertyPlaceholderConfigurer eppc = new EnvironmentPropertyPlaceholderConfigurer();

		Resource location = new ClassPathResource("service.properties");
		eppc.setLocation(location);

		return eppc;
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoCredentials mongoCredentials) throws Exception {
        return new MongoTemplate(new Mongo(mongoCredentials.getHost(), mongoCredentials.getPort()), mongoCredentials.getName(), mongoCredentials.getUserCredentials());
    }
}
