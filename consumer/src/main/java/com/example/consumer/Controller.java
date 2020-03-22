package com.example.consumer;

import com.example.myservice.SayHello;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Reference
    private SayHello sayHello;

    @GetMapping("/get/{name}")
    public String sayHello(@PathVariable("name")String name){

        return sayHello.say(name);
    }
}
