package com.ltf.studyspringboot.controller;

import com.ltf.studyspringboot.dao.UserDao;
import com.ltf.studyspringboot.domin.User;
import com.ltf.studyspringboot.exception.ValidateException;
import com.ltf.studyspringboot.repository.UserRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserRepository userRepository;

    private UserDao userDao;

    public UserController(UserRepository userRepository, UserDao userDao) {
        this.userRepository = userRepository;
        this.userDao = userDao;
    }

    @RequestMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        //throw new ValidateException("你没有权限操作！","200");
        //return userRepository.getAllUser();
        return userDao.getAllUser();
    }

    @PostMapping(value = "/testUser")
    public User getAllUser(@RequestBody @Validated User user){
        System.out.println(user.toString());
        return user;
    }




}
