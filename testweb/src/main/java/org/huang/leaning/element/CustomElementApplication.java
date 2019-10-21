package org.huang.leaning.element;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("my-element.xml")
public class CustomElementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomElementApplication.class, args);
	}

}
