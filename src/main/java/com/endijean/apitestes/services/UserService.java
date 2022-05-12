package com.endijean.apitestes.services;

import com.endijean.apitestes.domain.User;
import com.endijean.apitestes.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);
}
