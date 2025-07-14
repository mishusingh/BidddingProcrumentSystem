package com.bps.biddingservice.Repository;

import com.bps.biddingservice.Model.Bidding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiddingRepository extends JpaRepository<Bidding, Long> {

    Bidding findByPurchaseId(Long purchaseRequestId);
}
