package com.example.microservicesimpleprovider;

import com.example.microservicesimpleapi.service.IUserService;
import com.example.microservicesimpleprovider.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SpringBootTest
class MicroserviceSimpleProviderApplicationTests {

    @Test
    void contextLoads() {

    }

    public static  void  main(String[] args){
        ProxyTest proxyTest=new ProxyTest();
       IUserService userService=(IUserService) proxyTest.bind(new UserServiceImpl());
        System.err.println(userService.getAllUsers());

    }

}

