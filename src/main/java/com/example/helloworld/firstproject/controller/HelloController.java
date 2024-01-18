package com.example.helloworld.firstproject.controller;

import com.example.helloworld.firstproject.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @RequestMapping(path = {"/hello/{message}", "/hello/{message}"}, method = RequestMethod.GET)
    public String sayHelloWithPathVariable(@PathVariable(required = false) String message) {
        return "Hello " + message;
    }

    @RequestMapping(path = {"/say/m"}, method = RequestMethod.GET)
    public String sayHelloWithRequestParam(@RequestParam(name = "mehmet",required = false) String message) {
        return "Hello " + message;
    }

    @PostMapping("/post")
    public User postData(@RequestBody User user) {
        System.out.println("User Added");
        return user;
    }

    @DeleteMapping(path = "/delete")
    public String deleteData() {
        return "Deleted ...";
    }

    @PatchMapping(path = "/patch")
    public String patchData() {
        return "Patched ...";
    }
}
