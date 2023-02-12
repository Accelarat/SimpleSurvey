package com.simplesurvey.controller;

import com.simplesurvey.entity.Students;
import com.simplesurvey.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/{id}")
    public Students findUserById(@PathVariable Long id) {
        return service.findUserById(id);
    }
}
