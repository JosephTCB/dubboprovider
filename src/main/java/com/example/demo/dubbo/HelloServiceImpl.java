package com.example.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by lichujun on 2018-05-28.
 */
@Service
@Component
public class HelloServiceImpl implements HelloService {
    public String hello(){
        return "hello world";
    }
}
