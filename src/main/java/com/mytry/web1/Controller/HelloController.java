package com.mytry.web1.Controller;

import com.mytry.web1.Service.HelloService;
import com.mytry.web1.Service.Impl.HelloProxyServiceImpl;
import com.mytry.web1.Service.Impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    HelloServiceImpl helloService;

    @Autowired
    HelloProxyServiceImpl helloProxyService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(String name) {
        return helloService.sayHello(name);
//        return helloProxyService.sayHello(name);
    }
}
