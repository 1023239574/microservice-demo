package com.example.microservicesimpledemo.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RedisListener {
    public void receiveMessage(String message){
        log.info("接收到的信息:"+message);
    }
}
