package com.mytry.web1.Service.Impl;

import com.mytry.web1.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HelloProxyServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String name) {
        return restTemplate.getForObject("http://localhost:8082/hello?name={name}",String.class, name);
    }
}
