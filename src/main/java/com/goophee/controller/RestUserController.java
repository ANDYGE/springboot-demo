package com.goophee.controller;

import com.goophee.entity.User;
import com.goophee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ru")
public class RestUserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public User show(@RequestParam(value = "name") String name) {
        User user = userService.findUserByName(name);
        return user;
    }
}
