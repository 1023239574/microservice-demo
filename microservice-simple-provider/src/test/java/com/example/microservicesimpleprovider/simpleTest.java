package com.example.microservicesimpleprovider;

import com.example.microservicesimpleapi.service.IUserService;
import com.example.microservicesimpleprovider.serviceImpl.UserServiceImpl;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class simpleTest {

    public static  void  main(String[] args){
        ProxyTest proxyTest=new ProxyTest();
            IUserService proxy=(IUserService) proxyTest.bind(new UserServiceImpl());
        System.err.println(proxy.getUserByUserName("zhangcheng"));

    }

}
    class ProxyTest implements InvocationHandler {

        private Object target=null;

        public Object bind(Object target){
            this.target=target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.err.println("前置通知");
            Object obj= method.invoke(target,args);
            System.err.println("后置通知");
            return obj;
        }
}

