package com.service;

import com.domain.Payment;
import com.domain.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@Service
public class PaymentService {
    @Autowired
    PaymentRepository repository;

    public List<Payment> findAll() {
        return this.repository.findAllBy();
    }
    public Payment findByPaymentId(Long paymentId){

        return this.repository.findByPaymentId(paymentId);
    }

    public void deleteAll() {
        this.repository.deleteAllBy();
    }


    public void savePayment(Payment payment) {

        this.repository.save(payment);
    }
}
