package com.example.jenkinsProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @RequestMapping(value = "hello")
    public String hello(){
        return "Spring boot Gradle Example "+new Date();
    }
}
