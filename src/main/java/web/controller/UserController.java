package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import web.dao.UserDao;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping(value = "/test")
    public String create() {
        System.out.println("????");
        return "car";
    }

    @GetMapping(value = "/cars")
    public String getCars() {
        System.out.println("Работает");
        return "Working";
    }
}
