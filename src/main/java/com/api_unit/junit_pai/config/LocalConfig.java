package com.api_unit.junit_pai.config;

import com.api_unit.junit_pai.domain.User;
import com.api_unit.junit_pai.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;


@Configuration
@Profile("local")
public class LocalConfig {


    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        ArrayList<User> users = new ArrayList<User>();

        for(int init =0; init <= 10; init++) {
            User u1 = new User(null, "Vinicius"+init,"vinicius"+init+"@mail.com","******");
            users.add(u1);
        }

        if(!users.isEmpty()){
            repository.saveAll(users);
        }


    }


}
