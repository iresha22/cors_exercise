package it.develhope.cors_esercizio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Applies to all endpoints
                        .allowedOrigins("http://localhost:3000", "http://example.com");// Allowed origins
                /*
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allowed methods
                        .allowedHeaders("*")  // Allow all headers
                        .allowCredentials(true);  // If credentials (cookies, authorization headers) are allowed

                 */
            }
        };
    }
}
