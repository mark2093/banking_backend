package com.simraninovation.bankingApi.controller;

import com.simraninovation.bankingApi.model.Account;
import com.simraninovation.bankingApi.model.User;
import com.simraninovation.bankingApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/new")
    public String saveUserDetails(@RequestBody User user) {
        System.out.println(user);
        User save = userService.save(user);
        return "Successfully Added " ;
    }

    @GetMapping("/users")
    public @ResponseBody
    Set<User> getUsers()  {
        return userService.findAll();


    }
    @GetMapping("/users/{id}")
    @ResponseBody
    public User getUsersById(@PathVariable("id") Long usr_id)  {
        return userService.findById(usr_id);


    }

}
