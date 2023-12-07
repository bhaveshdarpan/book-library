package com.letsbloom.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.letsbloom.book.services.DatabaseSeederService;

@SpringBootApplication
public class BookApplication {
    private final DatabaseSeederService databaseSeederService;
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

    public BookApplication(DatabaseSeederService databaseSeederService) {
        this.databaseSeederService = databaseSeederService;
    }

	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*") // Allow requests from any origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
                        .allowedHeaders("*"); // Allowed headers
            }
        };
    }

    @Bean
    public CommandLineRunner seedDatabase() {
        return args -> databaseSeederService.seedDatabaseWithRandomBooks(10); // Seed 10 random books on startup
    }
}
