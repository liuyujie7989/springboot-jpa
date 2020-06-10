package com.liuyujie.springboot_jpa.controller;

import com.liuyujie.springboot_jpa.dao.UserRepository;
import com.liuyujie.springboot_jpa.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-08 23:08
 **/
@RestController
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @RequestMapping("/getUserData")
    public List<User> getUserData() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
