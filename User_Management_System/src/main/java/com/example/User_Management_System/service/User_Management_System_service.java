package com.example.User_Management_System.service;


import com.example.User_Management_System.model.User_Management_System;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class User_Management_System_service {
    private static List<User_Management_System> names = new ArrayList<>();
    private static int nameCount=0;

    static {
        names.add(new User_Management_System(++nameCount,"Student_One","student_one","abcd",1234));
        names.add(new User_Management_System(++nameCount,"Student_Two","student_two","abce",1235));
        names.add(new User_Management_System(++nameCount,"Student_Three","student_three","abcf",1236));
        names.add(new User_Management_System(++nameCount,"Student_Four","student_four","abcg",1237));
        names.add(new User_Management_System(++nameCount,"Student_Five","student_five","abch",1238));
    }

    public List<User_Management_System> findAll()
    {
        return names;
    }

    public User_Management_System findById(int id)
    {
        Predicate<? super User_Management_System> predicate = userManagementSystem -> userManagementSystem.getId() == id;

        User_Management_System userManagementSystem = names.stream().filter(predicate).findFirst().get();
        return userManagementSystem;
    }

    public void addUser(User_Management_System userManagementSystem)
    {
        names.add(userManagementSystem);
    }

    public void deleteUser(int id)
    {
        Predicate<? super User_Management_System> predicate = userManagementSystem -> userManagementSystem.getId() == id;
        names.removeIf(predicate);
    }

    public void updateUser(int id , User_Management_System new_user)
    {
        User_Management_System userManagementSystem = findById(id);
        userManagementSystem.setId(new_user.getId());
        userManagementSystem.setName(new_user.getName());
        userManagementSystem.setUsername(new_user.getUsername());
        userManagementSystem.setAddress(new_user.getAddress());
        userManagementSystem.setPh_no(new_user.getPh_no());
    }
}
