package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@RestController
@Log4j2
public class Application {

	@RequestMapping("/")
	public String home() {
		
		return "Checking the fargate logging with Java application with log4j2";
		log.error("*****************test");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


