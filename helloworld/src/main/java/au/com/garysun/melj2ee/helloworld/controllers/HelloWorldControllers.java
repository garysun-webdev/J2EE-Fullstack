package au.com.garysun.melj2ee.helloworld.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllers {
    @GetMapping
    public String helloword(){
        return ("helloworld");
    }
}
