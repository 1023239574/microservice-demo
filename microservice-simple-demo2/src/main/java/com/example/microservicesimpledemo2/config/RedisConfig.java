package com.example.microservicesimpledemo2.config;

import com.example.microservicesimplecommon.utils.RedisUtil;
import com.example.microservicesimpledemo2.message.RedisListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@Configuration
public class RedisConfig {


    @Bean
    public MessageListenerAdapter messageListenerAdapter(RedisListener redisListener){
        return new MessageListenerAdapter(redisListener,"receiveMessage");
    }

    @Bean
    RedisMessageListenerContainer redisMessageListenerContainer(RedisConnectionFactory redisConnectionFactory,MessageListenerAdapter messageListenerAdapter){
        RedisMessageListenerContainer container =new RedisMessageListenerContainer();
        container.setConnectionFactory(redisConnectionFactory);
        container.addMessageListener(messageListenerAdapter,new PatternTopic(RedisUtil.TEST_CHANNEL));
        return container;
    }


}