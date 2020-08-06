package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {

		return "Checking the fargate logging with Java application with log4j2";
		// for(int i=0; i<= 8000; i++) {
		// 	//some business logic
		// 	//In each iteration we are printing single line logger 
		// 	log.info("TREPP Analytics Date is NULL for Instrument");
		// 	}

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


