package com.atvd.userdept.controllers;

import com.atvd.userdept.entities.User;
import com.atvd.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

/* Requisição(request) de Canal para chegar ao mapa(mapping)
    para acessar a essa classe juntamente com o método
 */
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}
