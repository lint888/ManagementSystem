package com.example.demo.student;

import net.bytebuddy.asm.Advice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(studentRepository repository){
        return args -> {
            student mariam = new student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5),
                    21
            );
          student alex = new student(
                  "Alex",
                  "alex.jamal@gmail.com",
                  LocalDate.of(2000, Month.FEBRUARY,10),
                  21
          );
          repository.saveAll(List.of(mariam,alex));
        };
    }
}
