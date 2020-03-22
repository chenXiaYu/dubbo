package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.myservice.SayHello;

@Service
public class ServiceIml implements SayHello {
    @Override
    public String say(String name) {
        return "hello"+name;
    }
}
