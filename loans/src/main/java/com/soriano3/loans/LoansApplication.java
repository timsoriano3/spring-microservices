package com.soriano3.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan("com.soriano3.loans.controller")
@EnableJpaRepositories("com.soriano3.loans.repository")
@EntityScan("com.soriano3.loans.model")
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

}
