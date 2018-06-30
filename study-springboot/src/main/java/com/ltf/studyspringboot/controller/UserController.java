package com.ltf.studyspringboot.controller;

import com.ltf.studyspringboot.domin.User;
import com.ltf.studyspringboot.exception.ValidateException;
import com.ltf.studyspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        throw new ValidateException("你没有权限操作！","200");
        //return userRepository.getAllUser();
    }

    @PostMapping(value = "/testUser")
    public User getAllUser(@RequestBody @Validated User user){
        System.out.println(user.toString());
        return user;
    }




}
