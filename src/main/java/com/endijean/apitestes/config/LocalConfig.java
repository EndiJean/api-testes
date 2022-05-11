package com.endijean.apitestes.config;

import com.endijean.apitestes.domain.User;
import com.endijean.apitestes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Endi", "endi@gmail.com", "123");
        User u2 = new User(null, "Pedro", "pedro@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
