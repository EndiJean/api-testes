package com.endijean.apitestes.services;

import com.endijean.apitestes.domain.User;

public interface UserService {

    User findById(Integer id);
}