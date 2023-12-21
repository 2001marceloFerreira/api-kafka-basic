package br.com.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    private static final Logger logger = LoggerFactory.getLogger(MensagemService.class);

    @Value("${topic.topico-kfk}")
    private String topicoKfk;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        logger.info("Mensagem => {}", message);
        this.kafkaTemplate.send(topicoKfk,message);
    }

}
