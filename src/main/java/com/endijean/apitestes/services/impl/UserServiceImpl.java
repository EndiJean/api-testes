package com.endijean.apitestes.services.impl;

import com.endijean.apitestes.domain.User;
import com.endijean.apitestes.repositories.UserRepository;
import com.endijean.apitestes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElse(null);
    }
}
