package com.mkurfeyiz.ecommerce_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan({"com.mkurfeyiz.ecommerce_web.*"})
@EntityScan("com.mkurfeyiz.ecommerce_web.model")
@EnableJpaRepositories("com.mkurfeyiz.ecommerce_web.dao")
public class ECommerceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceWebApplication.class, args);
    }

}
