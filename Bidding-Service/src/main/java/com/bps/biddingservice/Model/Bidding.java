package com.bps.biddingservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long biddingId;
    public Long purchaseId;
    public BigDecimal quote;
    public int deliveryDays;
    public String status;


}
