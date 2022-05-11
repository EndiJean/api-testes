package com.endijean.apitestes.resource;

import com.endijean.apitestes.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(new User(1, "Endi", "Endi@gmail.com", "123"));
    }
}
