package com.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@RepositoryRestResource(path = "paymentInfo")
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    @RestResource(path = "payment")
    List<Payment> findAllBy();
    @RestResource(path = "delete")
    @Transactional
    void deleteAllBy();

    Payment findByPaymentId(Long paymentId);
}
