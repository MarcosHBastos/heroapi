package com.wipro.trial.hero.controller;

import com.wipro.trial.hero.entity.User;
import com.wipro.trial.hero.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/{actives}")
    public List<User> getActives() {
        return userService.getActives();
    }

    @GetMapping("/{inactives}")
    public List<User> getInactives() {
        return userService.getInactives();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @PutMapping
    public User updateUser(@RequestBody User updUser) {
        return userService.updateUser(updUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
