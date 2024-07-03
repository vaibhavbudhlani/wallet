package com.budhlani.wallet.models;

import lombok.Data;

@Data
public class PaymentRequest {
    private String orderId;
    private double amount;
    private String typeOfPayment;
    private String customerName;
    private String customerEmail;
    private String uniqueId;



}
