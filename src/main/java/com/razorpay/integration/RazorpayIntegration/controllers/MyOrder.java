package com.razorpay.integration.RazorpayIntegration.controllers;

import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;


public class MyOrder {

    private long myOrderId;
    private String orderId;
    private String amount;
    private String receipt;
    private String status;


    private User user;
}
