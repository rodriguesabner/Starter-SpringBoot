package com.kingaspx.starter.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student = new Student(
                    "Abner",
                    "abnerodrigs@gmail.com",
                    LocalDate.of(1996, OCTOBER, 7)
            );

            repository.save(student);
        };
    }
}
