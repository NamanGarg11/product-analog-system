package org.naman.productanalogsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.naman.productanalogsystem.model")
public class ProductAnalogSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductAnalogSystemApplication.class, args);
    }
}

