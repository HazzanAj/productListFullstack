package com.AjaoH.Project.productListFullstack.ProductList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ProductAConfig {


    @Bean
    CommandLineRunner commandLineRunner(ProductARepository repository) {
        return args -> {
            ProductA Electronics = new ProductA("Phone", "250e",
                    LocalDate.of(2021, Month.MARCH, 8),
                    "500");
            ProductA Cloths = new ProductA("Jean", "35e",
                    LocalDate.of(2021, Month.JANUARY, 10),
                    "300");
            ProductA KitchenUtility = new ProductA("Stove", "350e",
                    LocalDate.of(2021, Month.APRIL, 1),
                    "100");
            ProductA Equipment = new ProductA("Vacuum-Cleaner", "105e",
                    LocalDate.of(2021, Month.FEBRUARY, 3),
                    "200");
            repository.saveAll(
                    List.of(Electronics, Cloths, KitchenUtility, Equipment)
            );
        };
    }
}