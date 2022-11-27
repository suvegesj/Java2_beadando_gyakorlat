package com.example.nb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Nb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Nb1Application.class, args);
    }
    @GetMapping("/feladat1a")

    public String kiir1aFajlbol() {
        return "fooldal";
    }


}

