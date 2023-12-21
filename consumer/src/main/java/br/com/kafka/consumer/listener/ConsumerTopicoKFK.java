package br.com.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerTopicoKFK {
    private final Logger logger = LoggerFactory.getLogger(ConsumerTopicoKFK.class);

    @KafkaListener(topics = "${topic.topico-kfk}", groupId = "group_id")
    public void consume(String menssage) throws IOException{
        logger.info(String.format("#### -> Consumed message -> %s", menssage));
    }

}
