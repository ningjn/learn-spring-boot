package org.lambda.gsrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Administrator
 */
@EnableOpenApi
@SpringBootApplication
public class GsRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsRestServiceApplication.class, args);
	}
}
