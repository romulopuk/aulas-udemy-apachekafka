package com.motta.paymentservice.service;

import com.motta.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
