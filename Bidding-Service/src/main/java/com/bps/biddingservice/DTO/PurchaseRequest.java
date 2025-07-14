package com.bps.biddingservice.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PurchaseRequest {
    private Long purchaseId;
    private String title;
    private String description;
    private String status;
    private Date deadLine;
}
