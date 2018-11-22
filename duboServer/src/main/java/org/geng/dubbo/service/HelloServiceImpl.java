package org.geng.dubbo.service;

import org.geng.dubbo.HelloService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello(String name){
        return "Hello , " + name;
    }
}
