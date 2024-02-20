package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import web.dao.UserDao;
import web.dao.UserDaoImpl;

@RestController
public class UserController {
    UserDao userDao;

    public UserController() {
    }

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "/test")
    public String create() {
        userDao.Create();
        System.out.println("????");
        return "car";
    }

    @GetMapping(value = "/cars")
    public String getCars() {
        System.out.println("Работает");
        return "Working";
    }
}
