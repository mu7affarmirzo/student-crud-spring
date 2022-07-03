package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );
            Student anvar = new Student(
                    "Anvar",
                    "anvar@gmail.com",
                    LocalDate.of(2003, APRIL, 21)
            );
            repository.saveAll(List.of(mariam, anvar));
        };
    }
}
