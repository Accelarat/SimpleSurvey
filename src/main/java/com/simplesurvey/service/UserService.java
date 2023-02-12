package com.simplesurvey.service;

import com.simplesurvey.entity.Students;
import com.simplesurvey.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Students findUserById(Long id) {
        return repository.findById(id).get();
    }
}
