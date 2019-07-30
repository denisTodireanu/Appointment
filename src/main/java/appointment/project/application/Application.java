package appointment.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("appointment.project.repositories")
public class Application {
	//this is the main static method
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
