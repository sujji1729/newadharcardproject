package com.example.newadharcardproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class project1 {
    @GetMapping("/name1")
    public String getname() {
        return "Anusha Achanta";
    }

    @GetMapping("/password1")
    public String getpassword() {
        return "Anu";
    }

    @GetMapping("/mobilenum1")
    public String getmobilenum1() {
        return "12345";
    }

}
