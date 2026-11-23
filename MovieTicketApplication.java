package com.movieticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MovieTicketApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieTicketApplication.class, args);
    }
}
