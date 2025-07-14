package com.bps.biddingservice.Service;

import com.bps.biddingservice.Client.PurchaseRequestClient;
import com.bps.biddingservice.DTO.PurchaseRequest;
import com.bps.biddingservice.Events.BiddingNotification;
import com.bps.biddingservice.Model.Bidding;
import com.bps.biddingservice.Repository.BiddingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BiddingService {

    private final BiddingRepository biddingRepository;
    private final PurchaseRequestClient purchaseRequestClient;

    private final BiddingEventProducer biddingEventProducer;




     public Bidding createBid(Bidding bidding){
         PurchaseRequest purchaseRequest = purchaseRequestClient.getById(bidding.getPurchaseId());
         Bidding bid = new Bidding();
         bid.setPurchaseId(purchaseRequest.getPurchaseId());
         bid.setStatus(bidding.getStatus());
         bid.setDeliveryDays(bidding.getDeliveryDays());
         bid.setQuote(bidding.getQuote());

         BiddingNotification event = new BiddingNotification();
         biddingEventProducer.sendNotification(event);
         return biddingRepository.save(bid);

     }

     public Bidding getByRequestId(Long purchaseRequestId){
         return biddingRepository.findByPurchaseId(purchaseRequestId);
     }

}
