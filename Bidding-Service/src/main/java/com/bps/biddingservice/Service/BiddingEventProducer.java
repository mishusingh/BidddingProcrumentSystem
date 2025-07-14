package com.bps.biddingservice.Service;

import com.bps.biddingservice.Events.BiddingNotification;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BiddingEventProducer {

    private KafkaTemplate<String, BiddingNotification> kafkaTemplate;
    private final String TOPIC = "biddingNotification";

    public BiddingEventProducer(KafkaTemplate<String, BiddingNotification> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendNotification(BiddingNotification event){
        kafkaTemplate.send(TOPIC, event);
    }
}
