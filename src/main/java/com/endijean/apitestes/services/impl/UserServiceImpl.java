package com.endijean.apitestes.services.impl;

import com.endijean.apitestes.domain.User;
import com.endijean.apitestes.repositories.UserRepository;
import com.endijean.apitestes.services.UserService;
import com.endijean.apitestes.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

}
