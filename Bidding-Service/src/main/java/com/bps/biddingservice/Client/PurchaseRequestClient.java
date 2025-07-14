package com.bps.biddingservice.Client;

import com.bps.biddingservice.DTO.PurchaseRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Procrument-Service", url = "http://localhost:8001")
public interface PurchaseRequestClient {
    @GetMapping("/api/purchase/{purchaseId}")
    PurchaseRequest getById(@PathVariable Long purchaseId);
}
