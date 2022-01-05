package cn.tickz.demo001helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public HelloController() {
        System.out.println("init Hello");
    }

    @RequestMapping("/")
    public String sayHello(){
        return "HelloWorld";
    }
}
