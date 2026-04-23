package com.example.lecture1.contollers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class User {
    private String name;
    private int age;
    private boolean isAvailable;
}

@RestController
public class DemoController {

    @GetMapping("/name")
    private User getName() {
        return new User("Anshul Vyas", 21, true);
    }
}
