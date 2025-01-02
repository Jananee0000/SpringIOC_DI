package org.tnsif.springannotation.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.tnsif.springannotation.repo.ProductRepository;
import org.tnsif.springannotation.repo.ProductRepositoryImpl;
import org.tnsif.springannotation.service.ProductService;
import org.tnsif.springannotation.service.ProductServiceImpl;

@Configuration
@ComponentScan(basePackages = "org.tnsif.springannotation")  // Replace with the base package where your classes reside
public class AppConfig {
    // No need to manually define beans here, Spring will automatically detect and register them
}