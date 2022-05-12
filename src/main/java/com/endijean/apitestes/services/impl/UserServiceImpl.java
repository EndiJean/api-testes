package com.endijean.apitestes.services.impl;

import com.endijean.apitestes.domain.User;
import com.endijean.apitestes.domain.dto.UserDTO;
import com.endijean.apitestes.repositories.UserRepository;
import com.endijean.apitestes.services.UserService;
import com.endijean.apitestes.services.exceptions.DataIntegratyViiolationException;
import com.endijean.apitestes.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        findByEmail(obj);
        return userRepository.save(mapper.map(obj, User.class));
    }

    private void findByEmail(UserDTO obj) {
        Optional<User> user = userRepository.findByEmail(obj.getEmail());
        if(user.isPresent()) {
            throw new DataIntegratyViiolationException("E-mail já cadastrado no sistema");
        }
    }

}
