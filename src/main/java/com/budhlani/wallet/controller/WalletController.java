package com.budhlani.wallet.controller;


import com.budhlani.wallet.models.PaymentResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/wallet")
public class WalletController {

       @PostMapping(value = "/receipt",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
       public Mono<String> getPaymentResponse(@RequestBody PaymentResponse paymentResponse){
           System.out.println(paymentResponse);
           return Mono.just(paymentResponse.getReceipt());
       }
}
