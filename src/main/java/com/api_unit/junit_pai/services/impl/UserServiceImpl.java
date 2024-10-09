package com.api_unit.junit_pai.services.impl;

import com.api_unit.junit_pai.domain.User;
import com.api_unit.junit_pai.repositores.UserRepository;
import com.api_unit.junit_pai.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
