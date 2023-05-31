package com.kachinga.asms.amcos.repository;

import com.kachinga.asms.amcos.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long>, JpaSpecificationExecutor<Buyer> {

}