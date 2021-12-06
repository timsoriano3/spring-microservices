package com.soriano3.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan("com.soriano3.cards.controller")
@EnableJpaRepositories("com.soriano3.cards.repository")
@EntityScan("com.soriano3.cards.model")
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
