package com.xy.springcloud.service;

import com.xy.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
