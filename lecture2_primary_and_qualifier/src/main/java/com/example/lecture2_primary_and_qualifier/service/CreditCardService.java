package com.example.lecture2_primary_and_qualifier.service;

import org.springframework.stereotype.Component;

import com.example.lecture2_primary_and_qualifier.interfaces.Payment;

@Component
public class CreditCardService implements Payment {

    @Override
    public void processPayment() {
        System.out.println("Process Credit card Service");
    }

}
