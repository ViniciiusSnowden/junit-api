package com.api_unit.junit_pai.services;

import com.api_unit.junit_pai.domain.User;

import java.util.ArrayList;

public interface UserService {

    User findById(Integer id);

    ArrayList<User> findAll();
}
