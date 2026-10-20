package com.example.storex_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class StorexBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorexBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner testDatabase(JdbcTemplate jdbcTemplate) {
        return args -> {
            Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            System.out.println("Database connection successful: " + result);
        };
    }
}