package com.masteril.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MusiqueService {

    private static void main(String[] args){
        SpringApplication.run(MusiqueService.class);
    }

}
