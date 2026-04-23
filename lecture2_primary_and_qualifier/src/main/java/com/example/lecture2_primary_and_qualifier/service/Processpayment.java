package com.example.lecture2_primary_and_qualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lecture2_primary_and_qualifier.interfaces.Payment;

@RestController
public class Processpayment {
    Payment processPayment;

    @Autowired
    public Processpayment(@Qualifier("creditCardService") Payment processPayment) {
        this.processPayment = processPayment;
    }

    @GetMapping("/api/v1/service")
    public String getPayment() {
        return "Anshul";
    }
}
