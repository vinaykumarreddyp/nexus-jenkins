package io.fabric8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class PipelineTestProjectApplication {

	@RequestMapping("/")
	String home() {
			return WebPageMessageGenerator.getWelcomeMessage();
	}

	public static void main(String[] args) {
		SpringApplication.run(PipelineTestProjectApplication.class, args);
	}
}
