package com.Kafka.Producer.KafkaProducer.Service;

import com.Kafka.Producer.KafkaProducer.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private static final String JSONTopic = "jsonPOC";
    KafkaTemplate<String, User> jsonTemplate;
    public void sendStringMessage(String name){
        generalTemplate.send(generalTopic,name);
    }



    @Autowired
    private static final String generalTopic = "generalPOC";
    KafkaTemplate<String,String> generalTemplate;
    public void sendJsonMessage(User user){
        jsonTemplate.send(JSONTopic,user);
    }

}
