package com.example.affordmedico;

import com.example.affordmedico.Entity.User;
import com.example.affordmedico.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class Controller {
    @Autowired
    private UserRepo userRepo;
    @GetMapping
    public List<User> user() {
        return userRepo.findAll();
    }
}
