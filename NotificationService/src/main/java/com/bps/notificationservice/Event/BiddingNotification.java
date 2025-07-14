package com.bps.notificationservice.Event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BiddingNotification {
    public Long biddingId;
    public Long purchaseId;
    public BigDecimal quote;
    public int deliveryDays;
    public String status;
}
