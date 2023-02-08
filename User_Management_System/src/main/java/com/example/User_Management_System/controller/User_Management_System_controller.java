package com.example.User_Management_System.controller;

import com.example.User_Management_System.model.User_Management_System;
import com.example.User_Management_System.service.User_Management_System_service;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user_management_app")
public class User_Management_System_controller {

    private final User_Management_System_service userManagementSystemService;

    public User_Management_System_controller(User_Management_System_service userManagementSystemService)
    {
        this.userManagementSystemService = userManagementSystemService;
    }

    @PostMapping("/add-names")
    public void addName(@RequestBody User_Management_System userManagementSystem)
    {
        userManagementSystemService.addUser(userManagementSystem);
    }
    @GetMapping("/find-names/id/{id}")
    public User_Management_System findNameById(@PathVariable int id)
    {
        return userManagementSystemService.findById(id);
    }
    @GetMapping("/find-all")
    public List<User_Management_System> findAllNames()
    {
        return userManagementSystemService.findAll();
    }
    @DeleteMapping("/delete-names/id/{id}")
    public void deleteName(@PathVariable int id)
    {
        userManagementSystemService.deleteUser(id);
    }
    @PutMapping("/update-todo/id/{id}")
    public void updateName(@PathVariable int id,@RequestBody User_Management_System userManagementSystem)
    {
        userManagementSystemService.updateUser(id,userManagementSystem);
    }
}
