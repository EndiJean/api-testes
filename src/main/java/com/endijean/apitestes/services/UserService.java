package com.endijean.apitestes.services;

import com.endijean.apitestes.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
