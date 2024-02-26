package com.example.newadharcardproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class project2 {
    @GetMapping("/name2")
    public String getname() {
        return "Ajayasree Dasari";
    }

    @GetMapping("/password2")
    public String getpassword() {
        return "jaya";
    }

    @GetMapping("/mobilenum2")
    public String getmobilenum1() {
        return "56789";
    }

}
