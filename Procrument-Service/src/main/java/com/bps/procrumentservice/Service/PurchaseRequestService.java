package com.bps.procrumentservice.Service;

import com.bps.procrumentservice.Model.PurchaseRequest;
import com.bps.procrumentservice.Repository.PurchaseRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseRequestService {

    private final PurchaseRequestRepository purchaseRequestRepository;

    public PurchaseRequest createPurchase(PurchaseRequest purchaseRequest){
        PurchaseRequest p = new PurchaseRequest();
        p.setTitle(purchaseRequest.getTitle());
        p.setDescription(purchaseRequest.getDescription());
        p.setStatus(purchaseRequest.getStatus());
        p.setDeadLine(purchaseRequest.getDeadLine());

        return purchaseRequestRepository.save(p);
    }

    public List<PurchaseRequest> getAll(){
        return purchaseRequestRepository.findAll();
    }

    public List<PurchaseRequest> getByStatus(String status){
        return purchaseRequestRepository.findByStatus(status);
    }

    public Optional<PurchaseRequest> getById(Long purchaseRequestId){
        return purchaseRequestRepository.findById(purchaseRequestId);
    }
}
