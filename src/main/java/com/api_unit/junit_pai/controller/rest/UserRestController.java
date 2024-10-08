package com.api_unit.junit_pai.controller.rest;

import com.api_unit.junit_pai.domain.User;
import com.api_unit.junit_pai.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {


    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
      return ResponseEntity.ok().body(userService.findById(id));
    };

    @GetMapping(value = "/")
    public ResponseEntity<ArrayList<User>> findAll(){
       return ResponseEntity.ok().body(userService.findAll());
    }




}
