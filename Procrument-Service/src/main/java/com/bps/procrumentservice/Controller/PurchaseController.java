package com.bps.procrumentservice.Controller;

import com.bps.procrumentservice.Model.PurchaseRequest;
import com.bps.procrumentservice.Service.PurchaseRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/purchase")
public class PurchaseController {

    private final PurchaseRequestService purchaseRequestService;

    @PostMapping
    public PurchaseRequest create(@RequestBody PurchaseRequest purchaseRequest){
        return purchaseRequestService.createPurchase(purchaseRequest);
    }

    @GetMapping
    public List<PurchaseRequest> getAllPurchaseRequest(){
        return purchaseRequestService.getAll();
    }

    @GetMapping("/status")
    public List<PurchaseRequest> getByStatus(@RequestParam String status){
        return purchaseRequestService.getByStatus(status);
    }

    @GetMapping("/{purchaseId}")
    public Optional<PurchaseRequest> getById(@PathVariable Long purchaseId){
        return purchaseRequestService.getById(purchaseId);
    }


}
