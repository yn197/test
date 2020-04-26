package com.itheima.Controller;

import com.itheima.Service.UserService;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author yn
 * @version 1.0
 * @date 2020/4/22 21:19
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id) {

        return service.queryById(id);
    }
}
