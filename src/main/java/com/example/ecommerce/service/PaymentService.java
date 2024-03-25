package com.example.ecommerce.service;

import com.example.ecommerce.domain.Payment;
import com.example.ecommerce.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<Payment> getPaymentList(){
        return paymentRepository.findAll();
    }

    @Transactional
    public Payment createPayment(Payment payment){
        return paymentRepository.save(payment);
    }
}
