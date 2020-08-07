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
		
		
		for(int i=0; i<= 10000; i++) {
			//some business logic
			//In each iteration we are printing single line logger anf this is causing problem
			log.info("TREPP Analytics Date is NULL for Instrument[instrumentId: " + 1122334454 + "] ");
			}
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
		return "Checking the fargate logging with Java application with log4j2";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


