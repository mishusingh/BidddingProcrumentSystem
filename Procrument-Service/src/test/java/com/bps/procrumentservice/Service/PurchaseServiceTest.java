package com.bps.procrumentservice.Service;


import com.bps.procrumentservice.Model.PurchaseRequest;
import com.bps.procrumentservice.Repository.PurchaseRequestRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import static reactor.core.publisher.Mono.when;

@ExtendWith(MockitoExtension.class)
public class PurchaseServiceTest {

    @Mock
    private PurchaseRequestRepository purchaseRequestRepository;

    @InjectMocks
    private PurchaseRequestService purchaseRequestService;

    @Test
    void  testCreatePurchase(){
        PurchaseRequest input = new PurchaseRequest();
        input.setTitle("Laptop");
        input.setStatus("PENDING");
        input.setDescription("For Development");

        PurchaseRequest saved = new PurchaseRequest();
        saved.setPurchaseId(1L);
        saved.setTitle("Laptop");
        saved.setDescription("For Developer");
        saved.setStatus("PENDING");

       Mockito.when(purchaseRequestRepository.save(any(PurchaseRequest.class))).thenReturn(saved);
       PurchaseRequest result = purchaseRequestService.createPurchase(input);

       assertNotNull(result);
       assertEquals("Laptop", result.getTitle());
        assertEquals("PENDING", result.getStatus());
        assertEquals(1L, result.getPurchaseId());

        verify(purchaseRequestRepository, times(1)).save(any(PurchaseRequest.class));

    }

}
