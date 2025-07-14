package com.bps.notificationservice.Service;

import com.bps.notificationservice.Event.BiddingNotification;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BiddingEventConsumer {

    @KafkaListener(topics = "bidding.notifications", groupId = "notification-group")
    public void listen(BiddingNotification event) {
        System.out.println("📨 Notification Received:");
        System.out.println("➡️  Status: " + event.getStatus());
    }

}
