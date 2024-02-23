package com.fantasticdreamstarrysky.springbootmybatis.controller;

import com.fantasticdreamstarrysky.springbootmybatis.pojo.User;
import com.fantasticdreamstarrysky.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 🌃梦幻◎星空🌃
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }

}
