package com.stragure.users.controller;


import com.stragure.users.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/")
public class UserController {


    @GetMapping("/message")
    public String getMessage(){
        return "This is User Information";
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers(){
        List<Users> users =IntStream.range(1,5).
                mapToObj(i -> new Users(
                        i,
                        "user" +i,
                        "user" +i + "@gmail.com",
                        1*5
                )).collect(Collectors.toList());
       // users.forEach(System.out::println);
        return  users;
    }
}
