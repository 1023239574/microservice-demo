package com.example.microservicesimplecommon.utils;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class KafkaUtil {
    @Autowired
    @Qualifier("kafkaTemplate")
    private KafkaTemplate<String,String> _kafkaTemplate;

    private static KafkaTemplate<String,String> kafkaTemplate;

    @PostConstruct
    private  void init(){
      kafkaTemplate=_kafkaTemplate;
    }

    public static void sendMessage(String topic,Object message){
        log.info("kafkaMessageSend--------->"+message);
        kafkaTemplate.send(topic, JSON.toJSONString(message));
    }

}
