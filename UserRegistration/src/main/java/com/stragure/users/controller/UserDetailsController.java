package com.stragure.users.controller;

import com.stragure.users.model.Users;
import com.stragure.users.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserDetailsController {

    private final UserService userService;

    public UserDetailsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> fetchAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users fetchUserById(@PathVariable Long id) {
        Users user = userService.getUserById(id);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with id: " + id);
        }
        return user;
    }
}
