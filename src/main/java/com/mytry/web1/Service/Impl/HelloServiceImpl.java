package com.mytry.web1.Service.Impl;

import com.mytry.web1.Service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello " + name + " visit web1";
    }
}
