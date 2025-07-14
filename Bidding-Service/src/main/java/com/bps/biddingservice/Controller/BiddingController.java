package com.bps.biddingservice.Controller;

import com.bps.biddingservice.Model.Bidding;
import com.bps.biddingservice.Service.BiddingService;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bidding")
public class BiddingController {

    private final BiddingService biddingService;

    @PostMapping
    public Bidding createBid(@RequestBody Bidding bidding){
        return biddingService.createBid(bidding);
    }

    @GetMapping("/{purchaseId}")
    public Bidding getByPurchaseId(@PathVariable Long purchaseId){
        return biddingService.getByRequestId(purchaseId);
    }
}
