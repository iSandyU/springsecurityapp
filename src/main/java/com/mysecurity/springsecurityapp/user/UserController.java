package com.mysecurity.springsecurityapp.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello Worlds";
    }
}
