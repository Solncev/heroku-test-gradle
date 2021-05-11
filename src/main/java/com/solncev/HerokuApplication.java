package com.solncev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HerokuApplication {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }

}
