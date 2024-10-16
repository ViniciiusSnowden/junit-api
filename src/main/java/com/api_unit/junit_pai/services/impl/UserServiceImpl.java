package com.api_unit.junit_pai.services.impl;

import com.api_unit.junit_pai.domain.User;
import com.api_unit.junit_pai.services.repositores.UserRepository;
import com.api_unit.junit_pai.services.UserService;
import com.api_unit.junit_pai.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("User not finder"));
    }

    @Override
    public ArrayList<User> findAll() {
        return !repository.findAll().isEmpty() ? (ArrayList<User>) repository.findAll() : null ;
    }

}
