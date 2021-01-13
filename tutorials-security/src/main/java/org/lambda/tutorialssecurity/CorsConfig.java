package org.lambda.tutorialssecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrator
 * 跨域访问配置
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
			.maxAge(168000)
			.allowedHeaders("*")
			.allowCredentials(true);
	}
}
