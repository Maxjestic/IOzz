package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    private List<String> users;

    {
        addAll();
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<String> getUsers(){
        return users;
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public int addUser(@RequestBody String newUser){
        users.add(newUser);
        return users.size();
    }
    public void addAll(){
        users = Arrays.asList("ala", "ola", "jan");
    }
}
