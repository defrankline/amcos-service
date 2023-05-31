package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.BuyerProduct;
import com.kachinga.asms.amcos.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {

}