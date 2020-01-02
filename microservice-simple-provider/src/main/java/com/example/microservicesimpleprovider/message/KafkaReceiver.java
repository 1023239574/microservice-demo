package com.example.microservicesimpleprovider.message;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaReceiver {
    @KafkaListener(topics = {"kafkaTest"})
    public void MessageReceiver(ConsumerRecord<?, ?> record){
        Optional<?> kafkaMessage=Optional.ofNullable(record.value());
        kafkaMessage.ifPresent(m -> log.info("kafka接收信息---------->"+m));
    }
}
